package medicalCenter;


import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.model.Profession;
import medicalCenter.storage.PersonStorage;
import medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalDemo implements Commands {


    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENTS:
                    addPatients();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                case PRINT_PROFESSION_BY_DOCTOR:
                    printProfessionByDoctor();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void printProfessionByDoctor() {
        Doctor doctor = new Doctor();
        Profession[] values = Profession.values();
        System.out.println("please choose profession from doctor: ");
        for (Profession value : values) {
            System.out.println(value);
        }
        String profStr = scanner.nextLine();
        try {
            doctor.setProfession(Profession.valueOf(profStr));
            System.out.println(doctor.getProfession());
        } catch (IllegalArgumentException e) {
            System.out.println("Please choose correct profession");
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void addPatients() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id, name, surname, phone, register DateTime(26-02-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time, please choose another time");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }

    }


    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name, surnam, phone, email, profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");

            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(Profession.valueOf(doctorData[4]));
            System.out.println("Doctor changed!");
        } else {
            System.out.println("doctor with " + doctorId + " dose not exists");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("doctor with " + doctorId + " dose not exists");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id, name, surnam, phone, email, profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();

            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProfession(Profession.valueOf(doctorData[5]));
            personStorage.add(doctor);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with " + doctorId + " doctor allrady");
        }


    }
}



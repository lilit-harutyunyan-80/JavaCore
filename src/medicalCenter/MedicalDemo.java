package medicalCenter;


import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.storage.DoctorStorage;
import medicalCenter.storage.PatientStorage;
import medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class MedicalDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();


    public static void main(String[] args) throws ParseException {

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
                    doctorStorage.print();
                    System.out.println("Please input company Id");
                    String companyId = scanner.nextLine();
                    Doctor doctorById = doctorStorage.getDoctorById(companyId);
                    if(doctorById != null) {
                        doctorStorage. searchDoctorByProfession(doctorById);
                    }else{
                        System.out.println("Company does not exists!");
                    }
                    break;
                case DELETE_DOCTOR_BY_ID:
                    doctorStorage.deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENTS:
                    addPatients();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENTS:
                    patientStorage.printToDaysPatients();
                    break;
                default:
                    System.out.println("wrong command! Please try again");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        patientStorage.printDoctors();
        System.out.println("Choose Doctor!");
        System.out.print("input doctor's id: ");
        String doctorID = scanner.nextLine();
        patientStorage.printAllPatientsByDoctor(doctorID.isEmpty());
    }

    private static void addDoctor() {
        System.out.println("Please input name, surname, phone, email, position");
        String doctorDateStr = scanner.nextLine();
        String[] doctorDate = doctorDateStr.split(",");
        String doctorId = doctorDate[0];
        Doctor doctorById = doctorStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorId, doctorDate[1], doctorDate[2], doctorDate[3]);
            doctorStorage.add(doctor);
            System.out.println("Doctor added!");
        } else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }


    private static void addPatients() {
        System.out.println("Please input name, surname, phone, register date time");
        String patientsStr = scanner.nextLine();
        String[] patientsDate = patientsStr.split(",");
        String patient = patientsDate[0];
        Patient patients = patientStorage.getPatient(patient);
        if (patient == null) {
            Patient patientStr = new Patient(patient, patientsDate[1], patientsDate[2], patientsDate[3], patientsDate[4]);
            patientStorage.add(patients);
            System.out.println("Patient added!");
        } else {
            System.out.println("Patient with " + patient + " already exists");
        }
    }


    private static void changeDoctorDataById() {
        doctorStorage.print();
        System.out.println("Please choose date id");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor != null) {
            System.out.println("Please input new date");
            String newDate = scanner.nextLine();
            doctor.setProfession(newDate);
            System.out.println("Date changed");
        } else {
            System.out.println("Date does not exists, please try again.");
        }
    }

    private static Object searchDoctorByProfession(Doctor doctorById) {
        System.out.println("Please input doctor profession");
        String professionStr = scanner.nextLine();
        Doctor doctor = (Doctor) searchDoctorByProfession(doctorById);
        if (doctor != null) {
            System.out.println("profession should be less then profession");
        } else {
            System.out.println("Profession " + professionStr + " not found!");
        }

        return null;
    }

}

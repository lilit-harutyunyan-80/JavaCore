package medicalCenter.storage;


import homework.employee.model.Employee;
import medicalCenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    public void add(Doctor doctor) {
        if (doctors.length == size) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(doctors[i] + " ");
        }
    }

    public Doctor getDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctors[i].getSurname().equals(doctorId)) {
                return doctor;
            }
        }
        return null;
    }

    public void deleteDoctorById() {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getId().equals(doctor)) {
                doctors[i] = null;
                System.out.println("Doctor with id " + doctor + " successfully removed!");
                return;
            }
        }
        System.out.println("Doctor with id " + doctors + " not found");
    }

    public void searchDoctorByProfession(Doctor doctorById) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getProfession().equals(doctors)) {
                System.out.println(doctors);
            }
        }
        if (!found) {
            System.out.println("Profession " + doctors + " not found");
        }
    }
}









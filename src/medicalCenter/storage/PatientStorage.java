package medicalCenter.storage;



import medicalCenter.model.Patient;

import java.util.Date;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void add(Patient patient) {
        if (patients.length == size) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(patients[i] + " ");
        }
    }

    public Patient getPatient(String patientId) {
        for (int i = 0; i < size; i++) {
            Patient patient = patients[i];
            if (patients[i].getSurname().equals(patient)) {
                return patient;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(boolean active) {
        for (int i = 0; i < size; i++) {
            if (patients[i].equals(patients) == active) {
                System.out.print(patients[i]);
            }
        }

    }

    public void printDoctors() {

    }

    public void printToDaysPatients() {
        boolean found = false;
        Date date = new Date();
        for (int i = 0; i < size; i++) {
            Patient patient = patients[i];
            if(patients[i].equals(patients)){
                System.out.println(patient);
                found = true;
            }
        }
        if(!found){
            System.out.println("No patients today!");
        }
    }
}



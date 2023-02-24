package medicalCenter.model;

import java.util.Date;
import java.util.Objects;

public class Patient {

    private String name;
    private String surname;
    private String phoneNumber;
    private String doctor;
    private String registerDateTime;

    public Patient(String name, String surname, String phoneNumber, String doctor, String registerDateTime) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient(String poxoxs, String poxosyan, String s, String valod, Date date, Date stringToDate) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doctor='" + doctor + '\'' +
                ", registerDateTime='" + registerDateTime + '\'' +
                '}';
    }


}

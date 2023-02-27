package medicalCenter.model;

public enum Profession {

    FAMILY_PHYSICIANS("Poxosyan"),
    INTERNISTS("Vardanyan"),
    EMERGENCY_PHYSICIANS("Minasyan"),
    PSYCHIATRISTS("Petrosyan");

    private String doctors;

    Profession(String doctors) {
        this.doctors = doctors;
    }

    public String getDoctors() {
        return doctors;
    }

    Profession() {
    }
}

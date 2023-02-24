package medicalCenter;

public interface Commands {

    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENTS = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TO_DAYS_PATIENTS = "7";



    static void printCommands() {
        System.out.println("Please input "+EXIT+" for exit");
        System.out.println("Please input "+ADD_DOCTOR+" for add doctor");
        System.out.println("Please input "+SEARCH_DOCTOR_BY_PROFESSION+" for search doctor by profession");
        System.out.println("Please input "+DELETE_DOCTOR_BY_ID+" for delete doctor by Id");
        System.out.println("Please input "+CHANGE_DOCTOR_DATA_BY_ID+" for change doctor date by ID");
        System.out.println("Please input "+ADD_PATIENTS+" for add patients");
        System.out.println("Please input "+PRINT_ALL_PATIENTS_BY_DOCTOR+" for print all patients");
        System.out.println("Please input "+PRINT_TO_DAYS_PATIENTS+" for print to days patients");

    }
}


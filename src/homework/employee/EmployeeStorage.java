package homework.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeId().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Name with " + keyword + " not found!!!");
        }
    }

    public void searchByCompanyName(String keyword1) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(keyword1)) {
                found = true;
                System.out.println(employee);
            }
        }
        if(!found){
            System.out.println("CompanyName with " + keyword1 + " not found");
        }
    }
}



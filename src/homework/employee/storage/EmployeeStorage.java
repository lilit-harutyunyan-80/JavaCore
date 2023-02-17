package homework.employee.storage;

import homework.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(employees[i] + " ");
        }
    }


    public void printByStatus(boolean active) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == active) {
                System.out.print(employees[i]);
            }
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getEmployeeId().equals(id)) {
                return employee;
            }
        }
        return null;
    }


    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeId().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Name with " + keyword + " not found!!!");
        }
    }

    public void searchByCompanyName(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().contains(companyName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("CompanyName with " + companyName + " not found");
        }
    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                System.out.println(employee);
            }
        }
    }
}



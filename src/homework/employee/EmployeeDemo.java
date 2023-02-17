package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;
import javafx.beans.binding.Bindings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String registerDateStr = sdf.format(date);
        System.out.println(registerDateStr);

        System.out.println("Please write date of birthday");
        String dobStr = scanner.nextLine();
        Date dateOfBirthday = sdf.parse(dobStr);
        System.out.println(date);

        boolean isRun = true;

        employeeStorage.add(new Employee("Poxos", "Poxosyan", "A001", 1000, "Epam", "Director"));
        employeeStorage.add(new Employee("Petros", "Petrosyan", "A002", 500, "Epam", "Operator"));
        employeeStorage.add(new Employee("Martiros", "Martirosyan", "A003", 300, "Epam", "Driver"));

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                default:
                    System.out.println("wrong command. Please try again");

            }
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("employee inactivated");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }

    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && employee.isActive()) {
            employee.setActive(true);
            System.out.println("employee activated!");
        } else {
            System.out.println("Employee does not exists, or employee already active, please try again.");
        }
    }

    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("Please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed");
        } else {
            System.out.println("Employee does not exists, please try again.");
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input min, max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should be less then max salary");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employee");
        System.out.println("Please input 3 for search employee by ID");
        System.out.println("Please input 4 for search employee company by name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active");
        System.out.println("Please input 8 for inactivate employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void getEmployeeById() {
        System.out.println("Please input employeeId");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with " + employeeId + " does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("please input name, surname, employeeId, salary, company, position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newEmployee = new Employee(employeeData[0], employeeData[1],
                    employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(newEmployee);
            System.out.println("Employee was added");
        } else {
            System.out.println("employee with " + employeeId + " already exists");
        }

    }
}

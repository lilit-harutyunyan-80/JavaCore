package homework.employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee ID");
            System.out.println("Please input 4 for search employee by company name");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee Id");
                    String employeeId = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeId, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    System.out.print("employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword by employeeId");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByName(keyword);

                    break;
                case "4":
                    System.out.println("Please input keyword by company name");
                    String keyword1 = scanner.nextLine();
                    employeeStorage.searchByCompanyName(keyword1);
                    break;
                default:
                    System.out.println("wrong command. Please try again");

            }
        }
    }
}

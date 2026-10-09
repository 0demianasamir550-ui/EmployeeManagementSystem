import model.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Create a department
        Department department = new Department(1, "IT");

        // Create a commission employee
        CommissionEmployee employee1 = new CommissionEmployee(
                101,
                "Ahmed",
                Gender.MALE,
                LocalDate.of(2024, 1, 10),
                5000,
                5,
                10000
        );

        // Create a monthly employee
        MonthlyEmployee employee2 = new MonthlyEmployee(
                102,
                "Sara",
                Gender.FEMALE,
                LocalDate.of(2023, 5, 15),
                10000,
                20,
                10,
                true
        );

        // Create an hourly employee
        HourlyEmployee employee3 = new HourlyEmployee(
                103,
                "Omar",
                Gender.MALE,
                LocalDate.of(2025, 2, 1),
                100,
                45,
                150
        );

        // Add employees to the department
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        // Set department manager
        department.setManager(employee2);

        // Print all employees
        System.out.println("===== Employee Management System =====");

        department.printAllEmployees();

        // Print individual salaries
        System.out.println("\n===== Employee Salaries =====");

        System.out.println(
                employee1.getName() + " Salary: "
                        + employee1.calculateSalary()
        );

        System.out.println(
                employee2.getName() + " Salary: "
                        + employee2.calculateSalary()
        );

        System.out.println(
                employee3.getName() + " Salary: "
                        + employee3.calculateSalary()
        );

        // Print total payroll
        System.out.println("\nTotal Department Payroll: "
                + department.calculateTotalPayroll());
    }
}
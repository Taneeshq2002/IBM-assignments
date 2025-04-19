package org.projects;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Sample Inputs
        Employee e1 = new PermanentEmployee("P1002", "Eric Miller", "Finance", 35000.00);
        Employee e2 = new ContractualEmployee("C1001", "Roger Steven", "Sales", 5, 750000.00);

        e1.calculateTax();
        e2.calculateTax();

        employees.add(e1);
        employees.add(e2);

        // Sort by employee name
        Collections.sort(employees);

        // Print header
        System.out.printf("%-10s %-20s %-15s %-15s %-15s %-10s\n", "EmpID", "Name", "Dept", "Salary/Period", "PF/Amount", "Tax");

        // Print each employee
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
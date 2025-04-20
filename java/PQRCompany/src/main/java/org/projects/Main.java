package org.projects;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the details(use P for permanent and C for contractual employee):");

        for(int i=0;i<n;i++){
            String input[]=sc.nextLine().split(",");
            if(input.length==4){
               String employeeId=input[0];
               String employeeName=input[1];
               String department=input[2];
               double salary=Double.parseDouble(input[3]);
                Employee e1 = new PermanentEmployee(employeeId,employeeName,department,salary);
                e1.calculateTax();
                employees.add(e1);
            }
            else if(input.length==5){
                String employeeId=input[0];
                String employeeName=input[1];
                String department=input[2];
                int duration=Integer.parseInt(input[3]);
                double salary=Double.parseDouble(input[4]);
                Employee e2 = new ContractualEmployee(employeeId,employeeName,department,duration,salary);
                e2.calculateTax();
                employees.add(e2);
            }
        }


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
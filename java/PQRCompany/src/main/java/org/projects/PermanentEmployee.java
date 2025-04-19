package org.projects;

 class PermanentEmployee extends Employee{
     private double monthlySalary;
     private double pf;
     private double tax;

     public PermanentEmployee(String employeeId, String employeeName, String department, double monthlySalary) {
         super(employeeId, employeeName, department);
         this.monthlySalary = monthlySalary;
         this.pf = 0.15 * monthlySalary;
     }


     // Getters and Setters
     public double getMonthlySalary() { return monthlySalary; }
     public double getPf() { return pf; }
     public double getTax() { return tax; }

     public void setMonthlySalary(double monthlySalary) {
         this.monthlySalary = monthlySalary;
         this.pf = 0.15 * monthlySalary;
     }

     public void setTax(double tax) { this.tax = tax; }

     @Override
     public void calculateTax() {
         double annualSalary = monthlySalary * 12;
         this.tax = 0.10 * annualSalary;
     }

     // toString
     @Override
     public String toString() {
         return super.toString() + String.format("%-15.2f %-15.2f %-10.2f", monthlySalary, pf, tax);
     }
}

package org.projects;

class ContractualEmployee extends Employee {
    private int contractPeriod;
    private double contractAmount;
    private double tax;

    public ContractualEmployee(String employeeId, String employeeName, String department, int contractPeriod, double contractAmount) {
        super(employeeId, employeeName, department);
        this.contractPeriod = contractPeriod;
        this.contractAmount = contractAmount;
    }

    // Getters and Setters
    public int getContractPeriod() { return contractPeriod; }
    public double getContractAmount() { return contractAmount; }
    public double getTax() { return tax; }

    public void setTax(double tax) { this.tax = tax; }

    // Override tax calculation
    @Override
    public void calculateTax() {
        this.tax = 0.10 * contractAmount;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + String.format("%-15d %-15.2f %-10.2f", contractPeriod, contractAmount, tax);
    }
}


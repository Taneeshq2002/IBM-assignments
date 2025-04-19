package org.projects;

abstract class Employee implements Comparable<Employee> {
    private String employeeId,employeeName,department;

    public Employee(String id,String name,String dept){
        this.employeeId=id;
        this.employeeName=name;
        this.department=dept;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public String getDepartment(){
        return this.department;
    }

    // Setters
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setDepartment(String department) { this.department = department; }

    public abstract void calculateTax();

    // toString
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-15s", employeeId, employeeName, department);
    }

    @Override
    public int compareTo(Employee other) {
        return this.employeeName.compareToIgnoreCase(other.employeeName);
    }
}

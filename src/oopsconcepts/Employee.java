package oopsconcepts;

public class Employee {
    private int employeeid;
    private String employeename;
    private double employeesalary;

    public Employee(int employeeid, String employeename, double employeesalary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeesalary = employeesalary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployee_salary() {
        return String.format("Rs%, .2f",employeesalary);
    }

    public void setEmployeesalary(double employeesalary) {
        this.employeesalary = employeesalary;
    }

    public static void main(String[] args) {
        Employee e= new Employee(204910232,"yamini",50000);
        System.out.println(e.getEmployeeid());
        System.out.println(e.getEmployeename());
        System.out.println(e.getEmployee_salary());
        e.setEmployeesalary(80000.000);
        System.out.println(e.employeesalary);
    }
}

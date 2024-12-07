package Inheritance;

public class Employee1 extends Person{
    double empSalary;
    int empId;

    public Employee1(String firstName,String lastName,double empSalary, int empId) {
        super(firstName,lastName);
        this.empSalary = empSalary;
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

}

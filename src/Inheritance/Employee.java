package Inheritance;

public class Employee {
    int employeeNo;
    String name;
    double salary;
    public Employee(int employeeNo, String name,double salary) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.salary=salary;
    }
    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }
    public double getSalary(double salary) {
        return salary;
    }
    public void work(){
        System.out.println(name+" I'm an employee ");
    }

}

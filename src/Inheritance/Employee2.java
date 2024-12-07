package Inheritance;

public class Employee2 {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee2(String name, String address, double salary, String jobTitle){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public  String generatePerformanceReport(){
        return  "Employee" + "performed well";
    }
    public double calculateBonus(){
        return salary*0.10;
    }
}

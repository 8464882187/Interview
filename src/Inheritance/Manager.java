package Inheritance;

public class Manager extends Employee2{
    String department;

    public Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public double calculateBonus(){
        return super.calculateBonus()+(salary*0.05);
    }
    public  String generatePerformanceReport(){
        return  "Manager" + name + "performed well";

    }
    public void manageProject(String projectName){
        System.out.println("Manager "+ name + "is managing project");
    }
}

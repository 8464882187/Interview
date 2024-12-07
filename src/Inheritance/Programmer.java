package Inheritance;

public class Programmer extends  Developer{
    String specialization;

    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String specialization) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
    public double calculateBonus(){
        return super.calculateBonus() + (salary*0.02);
    }
    public void writeCode(String codeName){
        System.out.println("Programmer " + name + " is writing code "+ codeName);
    }

    public static void main(String[] args) {
        Manager m= new Manager("yamini","Bmp",100000.0,"Manager","IT");
        Developer d= new Developer("Anantha","Punur",80000.0,"Developer","Java");
        Programmer p = new Programmer("Usha","Adk",70000.0,"Programmer","Python","AI");
        System.out.println("Manager Information  **************");
        System.out.println("Name: "+ m.getName());
        System.out.println("Address: "+ m.getAddress());
        System.out.println("Salary: "+ m.getSalary());
        System.out.println("Job Title: "+ m.getJobTitle());
        System.out.println("Department: "+ m.getDepartment());
        System.out.println("Bonus: "+m.generatePerformanceReport());
        System.out.println("calculate Bonus: "+m.calculateBonus());
        System.out.println("*******************************");
        System.out.println("Developer Information *************");
        System.out.println("Name: "+ d.getName());
        System.out.println("Address: "+ d.getAddress());
        System.out.println("Salary: "+ d.getSalary());
        System.out.println("Job Title: "+ d.getJobTitle());
        System.out.println("Department: "+ d.getProgrammingLanguage());
        System.out.println("Bonus: "+d.generatePerformanceReport());
        System.out.println("calculate bonus: "+d.calculateBonus());
        System.out.println("**********************************");
        System.out.println("Programmer Information *************");
        System.out.println("Name: "+ p.getName());
        System.out.println("Address: "+ p.getAddress());
        System.out.println("Salary: "+ p.getSalary());
        System.out.println("Job Title: "+ p.getJobTitle());
        System.out.println("Department: "+ p.getProgrammingLanguage());
        System.out.println("Bonus: "+p.generatePerformanceReport());
        System.out.println("calculate bonus: "+ p.calculateBonus());
    }
}

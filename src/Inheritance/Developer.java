package Inheritance;

public class Developer extends  Employee2{
    String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public double calculateBonus(){
        return super.calculateBonus() + (salary*0.03);
    }
    public  String generatePerformanceReport(){
        return  "Developer" + name + "performed well";

    }
    public void developSoftware(String softwareName){
        System.out.println("Developer " + name + " is developing software "+ softwareName);
    }
}

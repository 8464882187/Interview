package Inheritance;
public class HRManager extends Employee{
    public HRManager(int employeeNo, String name,double salary) {
        super(employeeNo, name,salary);
    }
    public void work(){
        System.out.println(getName()+" Is Hr.....");
    }
    public void addNewEmployee(int employeeNo,String name, double salary){
        System.out.println("New Employee details::"+employeeNo+name+salary);
    }
    public static void main(String[] args) {
        Employee e = new Employee(232,"yamini",50000.00);
        e.work();
        System.out.println("Employee salary::"+e.getSalary(30000.0));
        HRManager h= new HRManager(12,"akshay",60000.00);
        h.work();
        System.out.println("HR salary "+h.getSalary(40000.0));
        h.addNewEmployee(1," usha ",70000.0);

    }
}

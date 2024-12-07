package oopsconcepts;

public class Person {
   private String name;
    private int age;
    private String country;

    public Person(String name,int age, String country) {
        this.name=name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person p= new Person("yamini",22,"India");
        System.out.println(p.getAge());
        System.out.println(p.getCountry());
        System.out.println(p.getName());
        p.setAge(25);
        p.setCountry("USA");
        p.setName("Yams");
        System.out.println(p.getAge());
        System.out.println(p.getCountry());
        System.out.println(p.getName());
    }
}

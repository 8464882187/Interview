package oopsconcepts;

import java.util.Scanner;

public class Student {
    public Student(int studentid, String studentname, char grade) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.grade = grade;
    }

    private int studentid;
    private String studentname;
    private char grade;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public static void addGrade(char grades){
        System.out.println(grades);
    }

    public static void main(String[] args) {
        Student s= new Student(232,"yamini",'A');
        System.out.println(s.getStudentname());
        System.out.println(s.getStudentid());
        addGrade('A');
        addGrade('C');
        addGrade('B');
        addGrade('D');

    }
}

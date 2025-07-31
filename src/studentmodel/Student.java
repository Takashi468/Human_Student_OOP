package studentmodel;

import humanmodel.Human;

public class Student extends Human {
    private String studentId;
    private String major;
    private int year;
    private double gpa;

    public Student(String name, int age, String gender, String nationality, String address, String phone, String email, String occupation,
                   String studentId, String major, int year, double gpa) {
        super(name, age, gender, nationality, address, phone, email, occupation);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(getName() + " is studying " + major + ".");
    }

    public void registerCourse() {
        System.out.println(getName() + " is registering for courses.");
    }

    public void takeExam() {
        System.out.println(getName() + " is taking an exam.");
    }

    public void showGPA() {
        System.out.println("GPA: " + gpa);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is doing part-time work.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a student majoring in " + major + ".");
    }

    // Getters & Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}

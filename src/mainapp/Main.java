package mainapp;

import humanmodel.Human;
import studentmodel.Student;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Russell", 24, "Male", "Thai", "123 St", "123456789", "Russell@thai.co.th", "Engineer");
        Student s = new Student("Getago", 24, "Male", "Thai", "456 Rd", "987654321", "Getago@thai.co.th", "Student",
                                "S123456", "Computer Engineer", 3, 3.85);

        h.introduce();
        h.eat();
        h.occupationInfo();

        System.out.println();

        s.introduce();         
        s.study();             
        s.takeExam();          
        s.showGPA();           
        s.work();
    }
}
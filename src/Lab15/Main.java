package Lab15;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] marks1 = new int[]{1, 2, 3};
        int[] marks2 = new int[]{3, 3, 5};
        Student st1 = new Student("Victor", 3, 123, marks1);
        Student st2 = new Student("Ivan", 3, 124, marks2);
        Student st3 = new Student("Bob", 2, 125, marks2);
        Students Students = new Students();
        Students.add(st1);
        Students.add(st2);
        Students.add(st3);
        Students.deduct();
        List<Student> print_students = new ArrayList<Student>(Students);
        Students.printStudents(print_students, 4);
    }
}

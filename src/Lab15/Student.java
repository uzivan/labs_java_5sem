package Lab15;

import java.util.List;
import java.util.ArrayList;

public class Student{
    String name = new String();
    int course;
    int group;
    Marks marks;
    public Student(String name, int course, int group, int [] marks){
        this.course = course;
        this.name = name;
        this.group = group;
        this.marks = new Marks(marks);
    }


}

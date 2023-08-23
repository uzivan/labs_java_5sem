package Lab15;

import java.util.ArrayList;
import java.util.List;

public class Students extends ArrayList<Student> {
    public void deduct() {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).marks.average < 3) {
                this.remove(i);
                i--;
            } else {
                this.get(i).course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).course == course) {
                System.out.println(students.get(i).name);
            }
        }
    }
}

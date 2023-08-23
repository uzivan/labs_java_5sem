package Lab9;

public class Student {
    public String name;
    public String surname;
    public double average_rating;

    public Student(){
        name = new String();
        surname = new String();
    }

    public Student(double mark){
        name = new String();
        surname = new String();
        average_rating = mark;
    }

    public int getScholarship() {
        if (average_rating == 5.0) {
            return 80;
        } else {
            return 40;
        }
    }
}

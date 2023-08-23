package Lab9;

public class Main {
    public static void main(String[] args){
        Student a = new Student(5.0);
        System.out.println(a.getScholarship());
        PostGraduateStudent b = new PostGraduateStudent(4.0);
        System.out.println(b.getScholarship());
    }
}

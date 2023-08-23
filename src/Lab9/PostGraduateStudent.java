package Lab9;

public class PostGraduateStudent extends Student{
    public PostGraduateStudent(double mark){
        super(mark);
    }
    @Override
    public int getScholarship(){
        if (average_rating == 5){
            return 150;
        }
        else{
            return 100;
        }
    }
}

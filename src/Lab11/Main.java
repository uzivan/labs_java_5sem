package Lab11;

public class Main {
    public static void main(String [] args){
        Rectangle rec = new Rectangle();
        try {
            rec.get(0, 2);
        }
        catch(LengthException a){
            a.printStackTrace();
        }
    }
}

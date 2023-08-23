package Lab11;

public class Rectangle {
    private int a;
    private int b;

    public void get(int a, int b) throws LengthException {
        if(a<=0 && b<=0){
            throw new LengthException("Некоректная длина");
        }
        this.a = a;
        this.b = b;
    }
}

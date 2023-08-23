package Lab8;

public class Main8 {
    public static void main(String[] args){
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(2, 3, 4);
        Vector.cross(a, b).print();
        Vector.sum(a, b).print();
        System.out.println(a.length());
        System.out.println(Vector.scalar(a, b));
        Vector.dif(a, b).print();
    }
}

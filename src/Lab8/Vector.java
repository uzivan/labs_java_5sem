package Lab8;

import static java.lang.Math.pow;

public class Vector {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return pow((x * x + y * y + z * z), 0.5);
    }

    public static Vector cross(Vector a, Vector b) {
        return new Vector((a.y * b.z - a.z * b.y), (a.z * a.x - a.x * b.z), (a.x * b.y - a.y * b.x));
    }

    public static double scalar(Vector a, Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static Vector sum(Vector a, Vector b) {
        return new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static Vector dif(Vector a, Vector b){
        return new Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public void print(){
        System.out.println("("+this.x+","+this.y+","+this.z+")");
    }
}

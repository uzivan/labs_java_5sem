package Lab12;

public class Square {
    private int a=0;
    public void get(int a){
        this.a = a;
    }
    public int area(){
        System.out.println(GetClassAndMethodName.getCallerClassAndMethodName());
        return a*a;
    }
}

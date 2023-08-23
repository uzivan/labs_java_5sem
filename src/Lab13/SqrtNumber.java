package Lab13;

import Lab11.LengthException;

import java.io.Closeable;
import java.lang.AutoCloseable;

public class SqrtNumber implements Closeable {
    private int count;

    public SqrtNumber(int count) {
        this.count = count;
    }

    public int get_count(){
        return count;
    }

    public double action(double a) throws LengthException {
        if(a>=0){
            return Math.sqrt(a);
        }
        else{
            throw new LengthException("Некоректная длина");
        }
    }

    @Override
    public void close() {
        System.out.println("FINISH");
    }
}
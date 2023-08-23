package Lab13;

import Lab11.LengthException;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        try(SqrtNumber counter = new SqrtNumber(5)) {
            Scanner in = new Scanner(System.in);
            for(int i = 0;i<counter.get_count();i++){
                System.out.println(counter.action(in.nextDouble()));
            }
        } catch (LengthException e) {
            e.printStackTrace();
        }
    }
}

package Lab22;

import java.util.HashMap;

public class Main {
    public static void main(String [] args){
        Integer[] arr = {1, 1, 3, 4, 5, 5, 5, 6, 7 , 8};
        HashMap<Integer, Integer> mass = new HashMap();
        mass = DoPair.map(arr);
        System.out.println(mass);
    }
}

package Lab18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Comparison {
    private static List<Integer> link;
    private static List<Integer> array;

    public static long create_link() {
        //List<Integer> link = new LinkedList<>();
        link = new LinkedList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            link.add(i);
        }
        return System.currentTimeMillis() - time1;
    }

    public static long create_array() {
        //List<Integer> array = new ArrayList<>();
        array = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            array.add(i);
        }
        return System.currentTimeMillis() - time1;
    }

    public static long choose_link() {
        List<Integer> link = new LinkedList<>();
        for (int i = 0; i < 500000; i++) {
            link.add(i);
        }
        long time1 = System.currentTimeMillis();
        int a;
        for (int i = 0; i < 100000; i++) {
            a = link.get((int) Math.random() * 500000);
        }
        return System.currentTimeMillis() - time1;
    }

    public static long choose_array() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 500000; i++) {
            array.add(i);
        }
        long time1 = System.currentTimeMillis();
        int a;
        for (int i = 0; i < 100000; i++) {
            a = array.get((int) Math.random() * 500000);
        }
        return System.currentTimeMillis() - time1;
    }

}

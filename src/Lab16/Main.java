package Lab16;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        String st1 = new String("qwe1");
        String st2 = new String("qwe2");
        String st3 = new String("qwe3");
        String st4 = new String("qwe1");
        Collection<String> str = new ArrayList<String>();
        str.add(st1);
        str.add(st2);
        str.add(st3);
        str.add(st4);
        Collection<String> qwe = Converting.remove_repetitions(str);
        System.out.println(qwe);
    }
}

package Lab14;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int min = 0;
        for (int i = 0; i < 5; i++) {
            str.add(in.nextLine());
            if (i == 0 || str.get(i).length() < min) {
                min = str.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (str.get(i).length()==min){
                System.out.println(str.get(i));
            }
        }
    }
}

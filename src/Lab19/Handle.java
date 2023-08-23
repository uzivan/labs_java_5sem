package Lab19;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Handle {
    public static ArrayDeque<Integer> handle_st() {
        ArrayDeque<Integer> cin = new ArrayDeque<>();
        ArrayDeque<Integer> cout = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Pattern pattern = Pattern.compile(" "); // шаблон "пробел"
        String[] strings = pattern.split(str); // сепарируем по шаблону pattern
        for (String s : strings) {
            cin.addLast(Integer.parseInt(s));
        }
        int size = cin.size();
        //for(int i=0;i<size;i++){
        //    System.out.print(cin.size());
        //    System.out.print(cin.pollLast());
         //   System.out.println(cin.size());
        //}
        //System.out.println(cin.size());
        for(int i = 0;i<size;i++){
            if ((i + 1) % 2 == 0) {
                cout.addLast(cin.pollLast());
            }
            else{
                cin.pollLast();
            }
        }
        return cout;
    }
}

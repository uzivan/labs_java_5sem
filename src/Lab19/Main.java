package Lab19;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> str = Handle.handle_st();
        int size = str.size();
        for (int i = 0;i < size;i++){
            System.out.print(str.pollFirst() + " ");
        }
    }
}

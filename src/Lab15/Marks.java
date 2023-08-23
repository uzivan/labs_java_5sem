package Lab15;

//import java.util.List;

import java.util.ArrayList;

public class Marks extends ArrayList {
    public int average;

    public Marks(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            this.add(i, arr[i]);
        }
        average = sum/this.size();
    }

}

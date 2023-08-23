package Lab22;

import java.util.HashMap;

public class DoPair {
    public static <T> HashMap<T, Integer> map(T[] mass) {
        HashMap<T, Integer> new_mass = new HashMap();
        for(int i = 0;i<mass.length;i++){
            if(new_mass.containsKey(mass[i])){
                new_mass.put(mass[i], new_mass.get(mass[i])+1);
            }
            else
                new_mass.put(mass[i], 1);
        }
        return new_mass;
    }
}

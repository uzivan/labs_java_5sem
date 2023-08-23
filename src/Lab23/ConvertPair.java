package Lab23;
import java.util.HashMap;
import java.util.ArrayList;
public class ConvertPair {
    public static <P, T> HashMap<P, ArrayList<T>> map(HashMap<T, P> old_map){
        //ArrayList<T> arr = new ArrayList<>();
        ArrayList<T> keys = new ArrayList<>(old_map.keySet());
        HashMap<P, ArrayList<T>> map = new HashMap<>();
        for (int i= 0;i<old_map.size();i++){
            if(map.containsKey(old_map.get(keys.get(i)))){
                map.get(old_map.get(keys.get(i))).add(keys.get(i));
            }
            else{
                ArrayList<T> a = new ArrayList<>();
                a.add(keys.get(i));
                map.put(old_map.get(keys.get(i)), a);
            }
        }
        return map;
    }
}

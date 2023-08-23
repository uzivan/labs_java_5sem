package Lab23;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        passportsAndNames.put(1234567, "Дональд Джон Трамп");

        System.out.println(ConvertPair.map(passportsAndNames));
    }
}

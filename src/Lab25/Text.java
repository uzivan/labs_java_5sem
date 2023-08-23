package Lab25;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text {
    private String text;

    //private String[] del_text;

    private List<String> del_text;

    public void read() {
        Scanner in = new Scanner(System.in);
        this.text = in.nextLine();
        String[] del_text;
        this.text = this.text.replace('-', ' ');
        del_text = text.split(" ");
        this.del_text = new ArrayList<>(List.of(del_text));
        Stream<String> stream = this.del_text.stream();
        stream.map(word -> word.replaceAll("[^A-Za-zА-Яа-яЁё]+", "").toLowerCase()).collect(Collectors.toMap(key -> key, val -> 1, Integer::sum))
                .entrySet().stream().sorted((e1, e2) -> {
                            // в порядке убывания их кол-ва упоминаний
                            int val = e1.getValue().compareTo(e2.getValue()) * -1;
                            if (val == 0) {
                                // потом уже в алфавитном порядке
                                val = e1.getKey().compareTo(e2.getKey())*1;
                                // слова на английском идут после русских
                                // тоже в алфавитном порядке
                                if (e1.getKey().charAt(0) <= 'z'
                                        && e2.getKey().charAt(0) > 'z'
                                        || e1.getKey().charAt(0) > 'z'
                                        && e2.getKey().charAt(0) <= 'z') {
                                    val *= 1;
                                }
                            }
                            return val;
                        }).limit(10).forEach(System.out::println);
    }
}

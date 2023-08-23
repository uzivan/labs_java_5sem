package Lab24;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User per1 = new User(1, "I", "U", 20, "R");
        list.add(per1);
        User per2 = new User(2, "V", "Z", 10, "England");
        list.add(per2);
        User per3 = new User(3, "A", "I", 7, "Russian");
        list.add(per3);
        User per4 = new User(4, "N", "U", 100, "USA");
        list.add(per4);
        User per5 = new User(5, "O", "K", 40, "Russian");
        list.add(per5);
        Stream<User> stream = list.stream();
        System.out.println("1)Отсортированные по lastName");
        stream.sorted(Comparator.comparing(User::get_firstName)).forEach(x -> System.out.println
                (x.id + " " + x.firstName + " " + x.lastName + " " + x.age + " " + x.country));
        stream = list.stream();
        System.out.println("2) Отсортироавнные по age");
        stream.sorted(Comparator.comparing(User::get_age)).forEach(x -> System.out.println
                (x.id + " " + x.firstName + " " + x.lastName + " " + x.age + " " + x.country));
        stream = list.stream();
        System.out.println("3)Проверка на возраст(age >7)");
        System.out.println(stream.filter(x -> x.age < 7).count() == 0);
        System.out.println("4)Средний возраст");
        stream = list.stream();
        System.out.println(stream.mapToInt(User::get_age).average());
        System.out.println("Количество разных разных стран проживания");
        stream = list.stream();
        System.out.println(stream.map(User::get_country).distinct().count());

    }

}

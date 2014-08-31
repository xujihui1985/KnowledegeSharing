import java.util.*;

public class ComparatorDemo {
    public static void main (String... args) {
        List<String> list = Arrays.asList("11","111", "1111", "11111");
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        list.forEach(System.out::println);
    }
}

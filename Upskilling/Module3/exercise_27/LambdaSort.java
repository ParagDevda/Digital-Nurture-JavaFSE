package Upskilling.Module3.exercise_27;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
     public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Charlie", "Alice");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}

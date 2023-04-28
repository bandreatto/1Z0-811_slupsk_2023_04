package pl.com.slupsk.ap.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.String;

class StreamExample {

    public static void main(String[] args) {
        String name = "Bartosz";
        List<Integer> integers = List.of(1, 2, 3);

        // 1. Metoda map, filter, forEach
        // Użycie for-each
//        integers.stream()
//                .map(element -> element * 3)
//                .filter(element -> element < 7)
//                .forEach(element -> {
//                    System.out.println("Element: " + element);
//                });

        // Zbieranie wyników - collect
//        List<Integer> collectedElements = integers.stream()
//                .map(element -> element * 3)
//                .filter(element -> element < 7)
//                .collect(Collectors.toList());
//
//        System.out.println(integers);
//        System.out.println(collectedElements);

        // Wypisanie elementów listy - forEach
        // Dla każdego elementu na liście integers,
        // wykonaj następującą operację
//        integers.forEach(element -> System.out.println(element));

        // *
        integers.forEach(System.out::println);
    }
}

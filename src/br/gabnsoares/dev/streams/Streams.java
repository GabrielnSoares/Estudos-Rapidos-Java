package br.gabnsoares.dev.streams;

import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<String> names = List.of("Bruno", "Mathias", "Gabriel", "Rogerio");

        var namesContaisA = names.stream()
                .filter(n -> n.contains("a"))
                .toList();

        System.out.println(namesContaisA);

/*        *var numbers =  IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

         List -> List -> List =list (reduced)
        numbers.reduce(0, (reduced, each) -> {
            System.out.println("Reduced: " + reduced);
            System.out.println("Each: " + each);
            System.out.println("----------------");
            return reduced + each;


        });*/
    }
}

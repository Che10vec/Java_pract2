import lv.tsi.lambda.PersonProcessingWithStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercise 1");

        List<String> listOfString = Arrays.asList("a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1");
        System.out.println(listOfString.get(0));

        System.out.println("\nExercise 2");

        listOfString.forEach( str -> System.out.println(str.toUpperCase()));

        System.out.println("\nExercise 3");

        listOfString.forEach( str -> {if(str.charAt(0)=='b'){System.out.println(str);}});

        System.out.println("\nExercise 4");

        listOfString.sort(null);
        listOfString.forEach(str -> {
            if(str.charAt(0)=='c'){
                System.out.println(str);;
            }
        });

        System.out.println("\nExercise 5");

        PersonProcessingWithStreams.main(args);
    }
}
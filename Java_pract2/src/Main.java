import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");

        List<String> listOfString = Arrays.asList("a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1");
        System.out.println(listOfString.get(0));

        System.out.println("Exercise 2");

        for(String str:listOfString){
            System.out.println(str.toUpperCase());
        }

        System.out.println("Exercise 1");

        for(String str:listOfString){
            System.out.println(str.charAt(0)=='b'?str:null);
        }

        System.out.println("Exercise 1");

        List<String> otherList = new ArrayList<>();
        for(String str:listOfString){
            if(str.charAt(0)=='c'){
                otherList.add(str);
            }
        }
        otherList.sort(null);
        System.out.println(otherList);

        System.out.println("Exercise 1");


    }
}
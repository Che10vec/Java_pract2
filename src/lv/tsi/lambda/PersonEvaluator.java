package lv.tsi.lambda;

import java.util.*;
import java.util.regex.Pattern;

public class PersonEvaluator {
    ArrayList<Person> persons;
    PersonEvaluator(){
        persons = new ArrayList<>();
    }
    public void findAndPrint(String regex){
        Pattern pattern = Pattern.compile(regex);
        this.persons.forEach(person -> {
            if(pattern.matcher(person.name).find()){
                System.out.println(person);
            }
        });
    }
    public void findAndPrint(int age){
        this.persons.forEach(person -> {
            if (person.age>=age){
                System.out.println(person);
            }
        });
    }
    /////////////////////////////////
    public void groupAndPrint(){
        Map<Integer, String> map = new HashMap<>();
        this.persons.forEach(person -> {
            map.merge(person.age, person.name, (a, b) -> a + b + ", ");
        });
        System.out.println(map);
    }
    /////////////////////////////////
    public int getAverageAge(){
        int avg = this.persons.stream()
                .map(person -> person.age)
                .reduce(0,(a,b)->a+b);
        return avg / this.persons.size();
    }
}

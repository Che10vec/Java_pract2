package lv.tsi.lambda;

public class Person implements Comparable<Person> {
    String name;
    int age;
    Person(){
    }
    Person(int age,String name){
        this.age =  age;
        this.name = name;
    }
    @Override
    public int compareTo(Person comparePerson) {
        //ascending order
        return this.age - comparePerson.age;
    }
    @Override
    public String toString(){
        return this.age + " = "+this.name;
    }
}

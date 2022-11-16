package lv.tsi.lambda;

public class PersonProcessingWithStreams {
    public static void iAmGonnaSayTheP_word(PersonEvaluator data){
        data.findAndPrint("P");
    }
    public static void noFreeTrial(PersonEvaluator data){
        data.findAndPrint(18);
    }
    public static void segregation(PersonEvaluator data){
        data.groupAndPrint();
    }
    public static void averageElderliness(PersonEvaluator data){
        System.out.println(data.getAverageAge());
    }

    public static void main(String[] args) {
        PersonEvaluator data = new PersonEvaluator();

        data.persons.add(new Person(28,"Max"));
        data.persons.add(new Person(22,"Peter"));
        data.persons.add(new Person(28,"Anna"));
        data.persons.add(new Person(16,"Lilianna"));
        data.persons.add(new Person(13,"Pamela"));
        data.persons.add(new Person(22,"David"));

        iAmGonnaSayTheP_word(data);
        System.out.println();
        noFreeTrial(data);
        System.out.println();
        segregation(data);
        System.out.println();
        averageElderliness(data);
    }
}

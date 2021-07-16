package TutorialLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Gronte", 60),
                new Person("Matthew", "Arnold", 60)
                );

        // You can sort on a list itself
        people.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        System.out.println(people);

        // Or you can sort on collections with the list as an input.
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println(people);

        printConditionally(people, (p) -> p.getLastName().startsWith("C"), (p) -> System.out.println(p));

        // Here is the referencemethod version.  Note that System.out is the instance (as opposed to the main):

        printConditionally(people, (p) -> p.getLastName().startsWith("C"), System.out::println);

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person p: people){
           if(predicate.test(p)){
               consumer.accept(p);
               //System.out.println('\n');
           }
        }
    }

}

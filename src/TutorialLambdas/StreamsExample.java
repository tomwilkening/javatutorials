package TutorialLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamsExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Gronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        // Here we want to do an assembly line where we use a stream to first identify individuals that
        // start with "C" and then prints
        people.stream()
                .filter((p)->p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getLastName()));

        long count = people.stream()
                .filter((p) -> p.getLastName().startsWith("C"))
                .count();
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

package TutorialLambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Gronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

        //  Two types of external iterators
        System.out.println("Using for loop");
        for (int i=0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        // For-in loop
        System.out.println("Using for-in loop");
        for (Person p : people){
            System.out.println(p);
        }


        //We can also allow the run time to iterate as it seems fit.  This is called an internal iterator.
        //This uses a lambda expression or a method reference:
        people.forEach(System.out::println);
        people.forEach((p) -> System.out.println(p));

        //The advantage of an internal iterator is that it allows it to be assigned to multiple threads.
        //


    }

}

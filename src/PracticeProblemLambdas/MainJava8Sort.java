package PracticeProblemLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainJava8Sort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Charles", "Dickens", 60));
        people.add(new Person("Lewis", "Carroll", 42));
        people.add(new Person("Thomas", "Bronte", 45));
        people.add(new Person("Matthew", "Arnold", 39));

        //  Step 1: Sort list by last name
        //  Note that Comparator is a functional interface.  So we can pass a lambda
        //  The lambda just uses the fact that we have a comparator that takes in two objects
        //  So we just write down the names of the objects and what we want thte sort to do.
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2:  Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printAll(people);

        // Step 3:  Create a method that prints all people that have last name beginning with C
        //  Here we just replace the condition with the lambda going from person to the code for this person
        System.out.println("Printing individuals with last name beginning with C");
        printConditional(people, p -> p.getLastName().startsWith("C"));

        // We can switch to the first name easily:
        printConditional(people, p -> p.getFirstName().startsWith("C"));

        // We can also use the same code to return
        // all participants by assigning the condition to always return true:
        printConditional(people, p -> true);



    }

    static void printAll(List<Person> people){
        for (Person p: people){
            System.out.println(p);
        }
    }

    static void printConditional(List<Person> people, Condition condition){
        for (Person p: people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}

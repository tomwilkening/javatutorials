package PracticeProblemLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MainJava8SortWithFunctionInterfaces {

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

    // You can use Function Interfaces to generate tests rather than using your own interfaces:
    // Predicate<T> returns a boolean and has the test() method as its method.  Note
    // T is the object, so in our case this will be person.
    static void printConditional(List<Person> people, Predicate<Person> predicate){
        for (Person p: people){
            if(predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

    // Out of the box interfaces allow for all sorts of lambdas:
    // Oredicate<T>  boolean operators on object T
    // Function<T,R>  operates on Target T and Returns R
    //
}

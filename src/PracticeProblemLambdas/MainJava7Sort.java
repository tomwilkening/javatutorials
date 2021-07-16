package PracticeProblemLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainJava7Sort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Charles", "Dickens", 60));
        people.add(new Person("Lewis", "Carroll", 42));
        people.add(new Person("Thomas", "Bronte", 45));
        people.add(new Person("Matthew", "Arnold", 39));

        //  Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2){
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });

        // Step 2:  Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printAll(people);

        // Step 3:  Create a method that prints all people that have last name beginning with C
        System.out.println("Printing individuals with last name beginning with C");
        printConditional(people, new Condition() {

            // Again, this uses the inner class to define the method being passed.
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Printing individuals with first name beginning with C");
        printConditional(people, new Condition() {

            // Again, this uses the inner class to define the method being passed.
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

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

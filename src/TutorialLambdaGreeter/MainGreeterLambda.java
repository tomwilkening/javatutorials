package TutorialLambdaGreeter;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class MainGreeterLambda {

    public static void main(String[] args) {

        // Lambdas allow you to pass a block of code without it being embedded in an object.
        // Example:  Suppose we want public void greetingFunction(){System.out.print("Hellow World!");}
        //
        // To convert to a lambda, we set greetingFunction = public void (){System.out.print("Hellow World!")
        // But Java doesn't require public and is smart enough to find void, so you can write
        // greetingFunction = () -> {System.out.print("Hello World!")};
        // Note, with a single line you can drop the {}

        // Note:  to construct a lambda, we need to create an interface!!!
        Greeting greetingFunction = () -> System.out.print("Hello World!" + "\n");
        greetingFunction.perform(); //This uses the interface logic (i.e., the perform expression)

        //Potentially we could have used an anonlymous inner class:
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello World!"+ "\n");
            }
        };
        innerClassGreeting.perform();

        Consumer<String> greetingConsumer = (s) -> System.out.print("Hello " + s + "\n");
        greetingConsumer.accept("James");

        myLambdaAdd addFunction = (int a, int b) -> a + b;

        System.out.println(addFunction.run(4,3));
        //doubleNumberFunction = (int a) -> a * 2;
        //addFunction = (int a, int b) -> a + b;
    }

    static public void greet(Greeting greetingFunction){
    }

    interface myLambda{
        void lambda();
    }

    interface myLambdaAdd{
        int run(int a, int b);
    }
}

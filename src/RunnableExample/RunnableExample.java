package RunnableExample;

import java.util.function.Function;

// Runnable is an interface that is easy to work with for generating lambdas.
public class RunnableExample {

    public static void main(String[] args) {

        // Changing something for git.

        // Example of an inner class for making a thread
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed insider Runnable");
            }
        });



    myThread.run();

    Runnable myLambdaThread = () -> System.out.println("Printed inside Runnable Lambda");

    myLambdaThread.run();

    }


}

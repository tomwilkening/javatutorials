package RunnableExample;

import java.util.function.Function;

// Runnable is an interface that is easy to work with for generating lambdas.
public class RunnableExample {

    public static void main(String[] args) {

        // Made another change to check git.
        // Changing something for git.
        // Looking at commit without a comment......
        // Now I am going to mess with this.  but only in master - now what?
        // Example of an inner class for making a thread
        // Changing this on github to play with things
        // Now trying the same thing with gitpull
        // Now trying to pull from a test branch

        // Adding some code to remove with a restore.
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

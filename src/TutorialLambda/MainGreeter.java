package TutorialLambda;

public class MainGreeter {

    public static void main(String[] args) {

        //This is a strange implementation where we first create an instance of the MainGreeter Class
        //and then call it.  I assume this is to make everything an object to distinguish between functional programming?
        MainGreeter greeter = new MainGreeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

    }

    public void greet(Greeting greeting){
        greeting.perform();
    }

}

package TutorialLambdas;

public class MethodReferenceExample {

    public static void main(String[] args) {

    Thread t = new Thread(() -> printMessage());  //Lambda Expression (PassThrough)

    Thread t_MR = new Thread(MethodReferenceExample::printMessage); //Method Reference Version

    }

    public static void printMessage() {
        System.out.println("Hello");
    }

}

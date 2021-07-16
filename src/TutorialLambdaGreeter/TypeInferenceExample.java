package TutorialLambdaGreeter;

public class TypeInferenceExample {

    public static void main(String[] args) {

        StringLengthLambda myLambda = (String s) -> s.length();

        //  Because the interface knows what you are looking for, you don't have to identify the object type
        StringLengthLambda myShortHandLambda = (s) -> s.length();

        // You can even drop the () if you want to.
        StringLengthLambda myVeryShortHandLambda = s -> s.length();


        System.out.print(myLambda.getLength("How Long is long?"));
        System.out.print(myShortHandLambda.getLength("How Long is long?"));
        System.out.print(myVeryShortHandLambda.getLength("How Long is long?"));

        String testString = "How Long is Long?";
        printLambda(s -> s.length(), testString);//LHS here is a lambda expression that gets passed and operates (via the interface) below.

    }

    public static void printLambda(StringLengthLambda l, String myString){
        System.out.print(l.getLength(myString));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}

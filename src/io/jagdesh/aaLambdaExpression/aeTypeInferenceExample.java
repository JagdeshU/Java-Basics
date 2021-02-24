package io.jagdesh.aaLambdaExpression;

public class aeTypeInferenceExample {

    interface StringLengthLambda{
        int getLength(String s);
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }

    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

}

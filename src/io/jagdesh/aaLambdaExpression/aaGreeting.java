package io.jagdesh.aaLambdaExpression;

public class aaGreeting {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
    }

}

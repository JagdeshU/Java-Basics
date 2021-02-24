package io.jagdesh.aaLambdaExpression;

public class aaGreeter {

    //  greet function to execute the action
    public void greet(abGreeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        aaGreeter greeter = new aaGreeter();

        abGreeting innerClassGreeting = new abGreeting() {

            @Override
            public void perform() {
                System.out.println("Hello World");
            }

        };

        System.out.println("Using Lambda Expression,,");
        greeter.greet(() -> System.out.println("Hello World"));

        System.out.println("--------------------");

        System.out.println("Without using Lambda Expression,,");
        greeter.greet(innerClassGreeting);

    }

}

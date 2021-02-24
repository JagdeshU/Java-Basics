package io.jagdesh.aaLambdaExpression;


@FunctionalInterface
interface Greeting{
    public void perform();
}

public class aaGreeter {

    //  greet function to execute the action
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        aaGreeter greeter = new aaGreeter();

        Greeting innerClassGreeting = new Greeting() {

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


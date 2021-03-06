package io.jagdesh.aaLambdaExpression;

public class acRunnableExample {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }

        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();

    }

}

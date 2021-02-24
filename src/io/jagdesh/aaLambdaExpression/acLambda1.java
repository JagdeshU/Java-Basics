package io.jagdesh.aaLambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class acLambda1 {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Tom");
        nameList.add("Hank");
        nameList.add("Sean");
        nameList.add("Richard");

        //  using Lambda Expression
        System.out.println("Using Lambda Expression,,");
        nameList.forEach((name) -> System.out.println(name));
        System.out.println("-------------------");

        //  without Lambda Expression - function call
        printName(nameList);

    }

    //  Function Declaration for implementing function without Lambda Expression
    private static void printName(List<String> nameList) {

        System.out.println("Without Lambda Expression,,");
        for (int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
        System.out.println("-------------------");

    }


}

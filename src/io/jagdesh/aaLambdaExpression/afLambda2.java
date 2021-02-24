package io.jagdesh.aaLambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class afLambda2 {

    public static class Person{

        private String firstName;
        private String lastName;
        private int age;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }

    }

    //  an interface
    interface Condition{
        boolean test(Person p);
    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );


        // Step 1: Sort list by last name

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        // Step 2: Create a method that prints all elements in the list

        System.out.println("Printing All Persons");
        printConditionally(people, p -> true);


        //  Step 3: Create a method that prints all people that have first name &last name beginning with C

        System.out.println("Printing all persons with first name beginning with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

        System.out.println("Printing all persons with last name beginning with C");
        printConditionally(people, p-> p.getLastName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {

        for (Person p : people){
            if (condition.test(p)){
                System.out.println(p);
            }
        }

    }

}

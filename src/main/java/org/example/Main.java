package org.example;

public class Main {
    public static void main(String[] args) {

        String name = "James McConnell";
        int age = 32;

        System.out.println("Hello world!");
        System.out.println("My name is " + name + " and I am "  + age + "-years-old.");

        //Get myClass instance from class 'MyClass'
        MyClass myClass = new MyClass();

        System.out.println(myClass.sonName);
        System.out.println(myClass.sonAge);

        //Call "sum" method
        System.out.println(sum());

        int myNumber = 10;
        int myNumber2 = 5;

        if (myNumber2 >= myNumber) {
            System.out.println("20 is greater than 10!");
        } else if (myNumber > myNumber2) {
            System.out.println("10 is greater than 5!");
        }


    }

    public static int sum(){
        int num1 = 10;
        int num2 = 50;

        return num1 + num2;
    }
}

class MyClass {
    String sonName = "Noah";
    int sonAge = 1;
}
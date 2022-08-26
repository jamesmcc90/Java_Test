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

        System.out.println(sum());

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
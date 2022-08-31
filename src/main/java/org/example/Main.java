package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String name = "James McConnell";
        int age = 32;

        System.out.println("Hello world!");
        System.out.println("My name is " + name + " and I am " + age + "-years-old.");

        //Get myClass instance from class 'MyClass'
        MyClass myClass = new MyClass();

        System.out.println("My son's name is " + myClass.sonName + " and he is " + myClass.sonAge + "-year-old.");

        //Call "sum" method
        System.out.println(sum());

        int myNumber = 10;
        int myNumber2 = 5;

        if (myNumber2 >= myNumber) {
            System.out.println("20 is greater than 10!");
        } else if (myNumber > myNumber2) {
            System.out.println("10 is greater than 5!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");

        String input = scanner.nextLine();

        if (input.isBlank()){
            System.out.println("please enter something!");
        }else if (!input.isBlank()){
          System.out.println("Hello " + input);
        }

        List<String> F1 = Arrays.asList("Alpine", "Mercedes", "Ferrari");
        System.out.println(F1);

        String[] cars = {"BMW", "Volkswagen"};
        System.out.println("Here are some cars:");
        for (String i : cars){
             System.out.println(i);
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
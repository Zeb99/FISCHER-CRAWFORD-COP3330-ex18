package org.example;
import java.util.Scanner;

/**
 * Temperature Converter
 * UCF cop3330 Fall 2021 Assignment 18 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int temp, converted_temp;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String input = scan.nextLine();
        System.out.println("Your choice: " + input);

        if (input.equalsIgnoreCase("C")){
            System.out.println("Please enter the temperature in Fahrenheit");
            temp = scan.nextInt();
            converted_temp = ((temp - 32) * 5) / 9;
            System.out.println("The temperature in Celsius is " + converted_temp);
        } else if(input.equalsIgnoreCase("F")){
            System.out.println("Please enter the temperature in Celsius");
            temp = scan.nextInt();
            converted_temp = ((temp * 9) / 5) + 32;
            System.out.println("The temperature in Fahrenheit " + converted_temp);
        } else {
            System.out.println("Your input was not valid");
        }

    }
}

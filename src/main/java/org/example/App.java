/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int numPeople = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        System.out.printf("%d people with %d pizzas (%d slices)%n", numPeople, pizzas, slices*pizzas);

        int serving = (slices*pizzas)/numPeople;

        System.out.printf("Each person gets %d pieces of pizza.%n", serving);

        if((((slices*pizzas)/numPeople) % 2) == 0)
            System.out.printf("There are 0 leftover pieces.");
    }
}

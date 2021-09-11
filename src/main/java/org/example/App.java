package org.example;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        final int conv = 350; //one gallon covers 350 sq feet
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of ceiling: ");
        int len = sc.nextInt();
        System.out.print("Enter width of ceiling: ");
        int wid = sc.nextInt();

        float area = len * wid;
        int gallonsNeeded = (int)Math.ceil( area/conv );

        System.out.printf("You will need to purchase %d gallons of paint to cover %.0f square feet.", gallonsNeeded, area);

    }
}

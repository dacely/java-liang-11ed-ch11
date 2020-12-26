package com.listings.lis09;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do
        {
            value = input.nextInt();
            if (!listOfIntegers.contains(value) && value != 0)
                listOfIntegers.add(value);
        } while (value != 0);

        System.out.print("The distinct numbers are: ");

        for (int v : listOfIntegers)
            System.out.printf(" %d", v);

        System.out.println();
    }
}

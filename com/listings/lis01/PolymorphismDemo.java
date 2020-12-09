package com.listings.lis01;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        GeometricObject[] arr = new GeometricObject[2];
        arr[0] = new Circle(1, "red", false);
        arr[1] = new Rectangle(1, 1, "black", true);

        for (GeometricObject obj : arr)
        {
            System.out.println(obj);
            displayObject(obj);
            System.out.println("\n");
        }
    }

    public static void displayObject(GeometricObject object)
    {
        System.out.printf("Created on: %1$tF %1$tr\n", object.getDateCreated());
        System.out.printf("Color: '%s'\n", object.getColor());
        System.out.printf("Filled: %b'\n", object.isFilled());
    }
}

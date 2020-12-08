package com.listings.lis01;

public class TestInheritance
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1);
        Rectangle r1 = new Rectangle(2, 4, "red", true);
        System.out.println(c1);
        System.out.println();
        System.out.println(r1);
    }
}

package com.listings.lis01;

public class TestEquals
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(5.5);
        Circle c3 = new Circle(4.3);
        GeometricObject c4 = new Circle(5.5);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
    }
}

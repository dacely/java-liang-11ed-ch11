package com.listings.lis01;

public class CastingDemo
{
    public static void main(String[] args)
    {
        displayObject(new Circle(1));
        displayObject(new Rectangle(1,1));
    }

    public static void displayObject(Object obj)
    {
        if (obj instanceof Circle)
        {
            Circle c1 = (Circle) obj;
            System.out.printf("The circle area is %.1f\n", c1.getArea());
            System.out.printf("The circle perimeter is %.1f\n", c1.getPerimeter());
        }
        else if (obj instanceof Rectangle)
        {
            System.out.printf("The rectangle area is %.1f\n", ((Rectangle) obj).getArea());
            System.out.printf("The rectangle Perimeter is %.1f\n", ((Rectangle) obj).getPerimeter());
        }
    }
}

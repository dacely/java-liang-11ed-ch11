package com.listings.lis01;

import java.util.StringJoiner;

public class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return  2 * (width + height);
    }

    @Override
    public String toString()
    {
        String str = "Rectangle: \n";
        str += "{\n";
        str += String.format("\tCreated on: %1$tF %1$tr\n", getDateCreated());
        str += String.format("\tColor: '%s'\n", getColor());
        str += String.format("\tFilled: '%b'\n", isFilled());
        str += String.format("\tWidth: '%.1f'\n", width);
        str += String.format("\tHeight: '%.1f'\n", height);
        str += String.format("\tPerimeter: '%.1f'\n", getPerimeter());
        str += String.format("\tArea: '%.1f'\n", getArea());
        str += "}\n";
        return str;
    }
}

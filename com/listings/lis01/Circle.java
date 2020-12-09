package com.listings.lis01;

public class Circle extends GeometricObject
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        String str = "Circle\n";
        str += "{\n\t";
        str += super.toString()
                .replace("\t", "\t\t")
                .replace("{", "\t{")
                .replace("}", "\t}");
        str += String.format("\tRadius: %.1f\n", radius);
        str += String.format("\tDiameter: %.1f\n", getDiameter());
        str += String.format("\tPerimeter: %.1f\n", getPerimeter());
        str += String.format("\tArea: %.1f\n", getArea());
        str += "}\n";
        return str;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Circle)
            return ((Circle) obj).radius == this.radius;
        else
            return false;
    }
}

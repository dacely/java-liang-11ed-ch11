package com.listings.lis01;

import java.util.GregorianCalendar;

public class GeometricObject
{
    private String color;
    private boolean filled;
    private final GregorianCalendar dateCreated;

    public GeometricObject()
    {
        color = "white";
        filled = false;
        dateCreated = new GregorianCalendar();
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        dateCreated = new GregorianCalendar();
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public GregorianCalendar getDateCreated()
    {
        return dateCreated;
    }

    @Override
    public String toString()
    {
        String str = "Geometric Object\n";
        str +="{\n";
        str += String.format("\tCreated on: %1$tF %1$tr\n", dateCreated);
        str += String.format("\tColor: '%s'\n", color);
        str += String.format("\tFilled: '%b'\n", filled);
        str +="}\n";
        return str;
    }
}

package com.listings.lis02;

public class DynamicBindingDemo
{
    public static void main(String[] args)
    {
        Object[] objArr = new Object[4];
        objArr[0] = new GraduateStudent();
        objArr[1] = new Student();
        objArr[2] = new Person();
        objArr[3] = new Object();

        for (Object o : objArr)
            System.out.println(o);
    }
}

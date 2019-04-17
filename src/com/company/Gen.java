package com.company;

public class Gen<T> {
    T ob;

    Gen(T o)
    {
        ob = o;
    }

    T getOb()
    {
        return ob;
    }

    String showType()
    {
        return ob.getClass().toString();
    }
}
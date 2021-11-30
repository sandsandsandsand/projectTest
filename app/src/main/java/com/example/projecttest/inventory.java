package com.example.projecttest;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class inventory
{
    public ArrayList<item> items = new ArrayList<>();


    public void removeItem(item target)
    {
        items.remove(target);
    }
    public void addItem(item target)
    {
        items.add(target);
    }
}


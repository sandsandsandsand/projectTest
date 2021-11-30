package com.example.projecttest;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class mapButton extends androidx.appcompat.widget.AppCompatButton
{
    public mapButton[][] gridRef;
    public int x;
    public int y;
    public boolean traversable = false;
    static int count = 0;
    public AppCompatActivity scene;

    //a tile on the map
    public mapButton(Context context)
    {

        super(context);
        count++;
    }
    public void activate()
    {
        System.out.println("by default do nothing, wall tiles will not override activate");
    }
    public void initiatePlayer()
    {

    }

    protected void flipToPlayer()
    {
        System.out.println("THIS SHOULDN'T PRINT");
    }
    protected void flipFromPlayer()
    {
        System.out.println("THIS SHOULDN'T PRINT");
    }


    protected boolean checkPlayer()
    {
        return false;
    }
}

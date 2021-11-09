package com.example.projecttest;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;

public class mapButton extends androidx.appcompat.widget.AppCompatButton
{
    public mapButton[][] gridRef;
    public int x;
    public int y;
    public boolean hasPlayer;
    public boolean traversable = false;
    static int count = 0;
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
}

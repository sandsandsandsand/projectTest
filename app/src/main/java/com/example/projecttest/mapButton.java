package com.example.projecttest;
import android.content.Context;

import androidx.annotation.NonNull;

public class mapButton extends androidx.appcompat.widget.AppCompatButton
{
    //a tile on the map
    public mapButton(Context context)
    {
        super(context);
    }
    public void activate()
    {
        System.out.println("by default do nothing, wall tiles will not override activate");
    }

}

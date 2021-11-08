package com.example.projecttest;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class mapButtonGrass
extends mapButton
{
    public mapButtonGrass(Context context)
    {

        super(context);

        System.out.println("grass created");

        setBackgroundResource(R.drawable.grass);
    }
    public void activate()
    {
        System.out.println("this is grass, move if player near");
    }

}

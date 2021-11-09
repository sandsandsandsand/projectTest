package com.example.projecttest;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class mapButtonGrass
extends mapButton
{
    public boolean hasPlayer = false;
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
    public void flipToPlayer()
    {
        hasPlayer = true;
        setBackgroundResource(R.drawable.grass_player);
    }
    public void flipFromPlayer()
    {
        hasPlayer = false;
        setBackgroundResource(R.drawable.grass);
    }
    public void activateTest()
    {
        flipToPlayer();
    }

}

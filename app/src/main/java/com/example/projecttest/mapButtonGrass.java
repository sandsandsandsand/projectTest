package com.example.projecttest;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class mapButtonGrass
extends mapButton
{
    public boolean traversable = true;
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
        if(hasPlayer)
        {
            System.out.println("PLAYER ON HERE");
        }
        else
            checkNeighbours();
    }
    public void flipToPlayer()
    {
        hasPlayer = true;
        setBackgroundResource(R.drawable.grass_player);
        System.out.println(x + "," + y + "flipped to player");
    }
    public void flipFromPlayer()
    {
        hasPlayer = false;
        setBackgroundResource(R.drawable.grass);
    }


    public void checkNeighbours()
    {
        System.out.printf("\n checking neighbors from %d,%d",x,y);

        System.out.printf("\n CHECKING 1 %d,%d",gridRef[x+1][y].x,gridRef[x+1][y].y);
        if(gridRef[x+1][y].hasPlayer)
        {
            System.out.printf("\n PLAYER FOUND AT %d %d",x+1,y);
            flipFromPlayer();
            gridRef[x+1][y].flipToPlayer();
            return;
        }
        System.out.printf("\n checking 2 %d,%d",x-1,y);
        if(gridRef[x-1][y].hasPlayer)
        {
            System.out.printf("\n PLAYER FOUND AT %d %d",x-1,y);
            flipFromPlayer();
            gridRef[x-1][y].flipToPlayer();
            return;
        }
        System.out.printf("\n checking 3 %d,%d",x,y+1);
        if(gridRef[x][y+1].hasPlayer)
        {
            System.out.printf("\n PLAYER FOUND AT %d %d",x,y+1);
            flipFromPlayer();
            gridRef[x][y+1].flipToPlayer();
            return;
        }
        System.out.printf("\n checking 4 %d,%d",x,y-1);
        if(gridRef[x][y-1].hasPlayer)
        {
            System.out.printf("\n PLAYER FOUND AT %d %d \n",x,y-1);
            flipFromPlayer();
            gridRef[x][y-1].flipToPlayer();
            return;
        }

    }


}

package com.example.projecttest;

import android.content.Context;

public class mapButtonAntagonist
        extends mapButton

{
    public mapButtonAntagonist(Context context)
    {
        super(context);
        setBackgroundResource(R.drawable.antagonist);
    }

    public void checkNeighbours()
    {
        System.out.printf("\n checking neighbors from %d,%d",x,y);

        if(gridRef[x+1][y].checkPlayer())
        {
            //start battle
            return;
        }
        else if(gridRef[x-1][y].checkPlayer())
        {
            //start battle
            return;
        }
        else if(gridRef[x][y+1].checkPlayer())
        {
            //start battle
            return;
        }
        else if(gridRef[x][y-1].checkPlayer())
        {
            //start battle
            return;

        }
        else
            return;

    }

}

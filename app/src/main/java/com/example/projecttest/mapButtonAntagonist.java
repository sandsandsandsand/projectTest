package com.example.projecttest;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mapButtonAntagonist
        extends mapButton

{
    public ArrayList<pokedigimon> antagonists = new ArrayList<>();
    public mapButtonAntagonist(Context context)
    {
        super(context);
        setBackgroundResource(R.drawable.antagonist);
        antagonists.add(new pokedigimon(10,10,10,2,"fire"));
    }

    public void activate()
    {
        checkNeighbours();
    }
    public void checkNeighbours()
    {
        System.out.printf("\n checking neighbors from %d,%d",x,y);

        if(gridRef[x+1][y].checkPlayer())
        {
            scene.startBattle(this,antagonists);

            return;
        }
        else if(gridRef[x-1][y].checkPlayer())
        {
            scene.startBattle(this,antagonists);
            return;
        }
        else if(gridRef[x][y+1].checkPlayer())
        {
            scene.startBattle(this,antagonists);
            return;
        }
        else if(gridRef[x][y-1].checkPlayer())
        {
            scene.startBattle(this,antagonists);
            return;

        }
        else
            return;

    }

}

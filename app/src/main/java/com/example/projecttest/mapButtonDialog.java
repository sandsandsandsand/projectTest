package com.example.projecttest;

import android.content.Context;
import android.content.Intent;

public class mapButtonDialog extends mapButton {
    public String text = "hello, this is dialogue text ";

    public mapButtonDialog(Context context) {
        super(context);
        setBackgroundResource(R.drawable.friend);
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
            scene.setContentView(R.layout.dialogue);
            return;
        }
        else if(gridRef[x-1][y].checkPlayer())
        {
            scene.setContentView(R.layout.dialogue);
            return;
        }
        else if(gridRef[x][y+1].checkPlayer())
        {
            scene.setContentView(R.layout.dialogue);
            return;
        }
        else if(gridRef[x][y-1].checkPlayer())
        {
            scene.setContentView(R.layout.dialogue);
            return;

        }
        else
            return;

    }

}

package com.example.projecttest;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class mapGrid extends GridLayout
{
    private int side;
    private mapButton[][] buttons = new mapButton[5][5];

    public mapGrid(Context context,int width, int Nside) {
        super(context);
        this.side = Nside;
        setColumnCount(side);
        setRowCount(side);
//        initiateButtons(context);
        for( int row = 0; row < side; row++ )
            {
                for (int col = 0; col < side; col++)
                {
                    if(row == 0 || col == 0 || row == 4 || col == 4)
                    {
                        //there's overlap at the corners, luckily we don't need to care
                        buttons[row][col] = new mapButtonWall(context);
                    }
                    else if(row == 3 && col == 3)
                    {
                        buttons[row][col] = new mapButtonAntagonist(context);
                    }
                    else
                        buttons[row][col] = new mapButtonGrass(context);
                    Button butt = buttons[row][col];
                    ((mapButton) butt).gridRef = buttons;
                    ((mapButton) butt).x = row;
                    ((mapButton) butt).y = col;
                    ((mapButton) butt).getId();
                    butt.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view)
                        {
                            ((mapButton) butt).activate();
                        }
                    });

                    addView( buttons[row][col], width, width );
                }
            }
        buttons[2][2].flipToPlayer();
        System.out.println("COUNT:  " + mapButton.count);
    }
}

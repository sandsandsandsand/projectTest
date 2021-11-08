package com.example.projecttest;

import android.content.Context;
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
//        buttons[0][0] = new mapButtonGrass(context);
//        buttons[9][9] = new mapButtonGrass(context);
//        buttons[2][2] = new mapButtonWall(context);
        for( int row = 0; row < side; row++ )
            {
                for (int col = 0; col < side; col++)
                {
                    buttons[row][col] = new mapButtonGrass(context);
                    addView( buttons[row][col], width, width );
                }
            }

    }
}

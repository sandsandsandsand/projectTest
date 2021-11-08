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
//        initiateButtons(context);
        for( int row = 0; row < side; row++ )
            {
                for (int col = 0; col < side; col++)
                {
                    if(row == 0 || col == 0 || row == 4 || col == 4)
                        buttons[row][col] = new mapButtonWall(context);
                    else
                        buttons[row][col] = new mapButtonGrass(context);

                    addView( buttons[row][col], width, width );
                }
            }

    }

//    private void initiateButtons(Context context)
//    {
//        buttons[0][0] = new mapButtonGrass(context);
//        buttons[0][0] = new mapButtonGrass(context);
//    }
}

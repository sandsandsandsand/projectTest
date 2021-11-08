package com.example.projecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private mapGrid grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int width = size.x/5;
        //we want a 5 piece grid
        //ButtonHandler buttonHandle = new ButtonHandler();
        grid = new mapGrid(this,width,5);
        setContentView(grid);
        System.out.println("test");

    }
}
package com.example.projecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id==R.id.action_party)
        {
            setContentView(R.layout.party);
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
    public void clickFire(View view){
        Toast.makeText(getApplicationContext(), "Fire pokedigimon was chosen", Toast.LENGTH_SHORT).show();
    }
    public void clickWater(View view){
        Toast.makeText(getApplicationContext(), "Water pokedigimon was chosen", Toast.LENGTH_SHORT).show();
    }
    public void clickOther(View view){
        Toast.makeText(getApplicationContext(), "This pokedigimon is not available", Toast.LENGTH_SHORT).show();
    }
    public void back(View view){
        Toast.makeText(getApplicationContext(), "This back button is in progress", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Thank you for your consideration", Toast.LENGTH_SHORT).show();
        //this.exit();
    }
}
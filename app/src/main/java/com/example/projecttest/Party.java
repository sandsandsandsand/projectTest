package com.example.projecttest;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

public class Party extends AppCompatActivity {

    private int with;
    private int mLastResourceId;
    private ArrayList<pokedigimon> pokedigimons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // content View
        setContentView(R.layout.party);

        Point size = new Point( );
        getWindowManager().getDefaultDisplay().getSize(size);
        with = size.x / 2;
        pokedigimons.add(new pokedigimon(10, 5, 10, 2, "fire"));
        pokedigimons.add(new pokedigimon(10, 5, 10, 2, "water"));
        pokedigimons.add(new pokedigimon(10, 5, 10, 2, "water"));



        
        // update view
        updateView();
    }
    public void setParty(View view){
      // the image view used to identify the individual poke
        ImageView poke = (ImageView)  view;





        pokedigimon first = pokedigimons.get(0);
        pokedigimon second = pokedigimons.get(1);
        pokedigimon third = pokedigimons.get(2);

        int clickedPoke = Integer.parseInt(poke.getTag().toString());

        switch (clickedPoke){
            case 1:
                Toast.makeText(getApplicationContext(), (first.getName()) + " pokedigimon was chosen", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), (second.getName()) + " pokedigimon was chosen", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(), (third.getName()) + " pokedigimon was chosen", Toast.LENGTH_SHORT).show();

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

        }

    }
    public Drawable getName(String name){
        //This section sets drawable variables that can be compared
        //to strings for the poke names equal to the corresponding poke
    //    String draw = "R.drawable.water";
        Resources res = getResources();
        Drawable water = ResourcesCompat.getDrawable(res, R.drawable.water,null);
        Drawable other = ResourcesCompat.getDrawable(res, R.drawable.other,null);
        Drawable fire = ResourcesCompat.getDrawable(res, R.drawable.firs,null);

        switch (name){
            case"fire":
                return fire;

            case "water":
                return water;

            default:
                return other;

        }


    }
    public void back2Grid (View view){
        this.finish();
    }
    public void updateView(){
        pokedigimon first = pokedigimons.get(0);
        pokedigimon second = pokedigimons.get(1);
        pokedigimon third = pokedigimons.get(2);

        ImageView one = (ImageView) findViewById(R.id.first)  ;
        one.setImageDrawable(getName(first.getName()));

        ImageView two = (ImageView) findViewById(R.id.second)  ;
        two.setImageDrawable(getName(second.getName()));
        ImageView three = (ImageView) findViewById(R.id.third)  ;
        three.setImageDrawable(getName(third.getName()));

    }



}

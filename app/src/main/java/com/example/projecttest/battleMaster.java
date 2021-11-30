package com.example.projecttest;

import android.widget.Toast;

import java.util.ArrayList;

public class battleMaster

{
    ArrayList<pokedigimon> frens;
    ArrayList<pokedigimon> fiends;
    pokedigimon currentFriend;
    pokedigimon currentFoe;
    MainActivity scene;

    public battleMaster(ArrayList friends, ArrayList foes,MainActivity main)

    {
        frens = (ArrayList<pokedigimon>) friends.clone();
        fiends = (ArrayList<pokedigimon>) foes.clone();
        currentFriend = frens.get(0);
        currentFoe = frens.get(0);
        scene = main;



    }
    public void startAttacks()
    {
        if(currentFriend.attack(currentFoe))
        {

            Toast.makeText(scene, "target fainted, you won", Toast.LENGTH_SHORT).show();
            scene.back2Grid();
        }
        else
        {
            if((currentFoe.attack(currentFriend)))
            {

                Toast.makeText(scene, "target fainted, you won", Toast.LENGTH_SHORT).show();
                scene.back2Grid();
            }
        }
    }


}

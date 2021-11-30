package com.example.projecttest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class battleMaster

{
    ArrayList<pokedigimon> frens;
    ArrayList<pokedigimon> fiends;
    public battleMaster(ArrayList friends, ArrayList foes)

    {
        frens = (ArrayList<pokedigimon>) friends.clone();
        fiends = (ArrayList<pokedigimon>) foes.clone();

    }

}

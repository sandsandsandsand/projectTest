package com.example.projecttest;

public class PartyButton {
    private pokedigimon poke;

    public PartyButton( pokedigimon pokepoke, String name){
      //  super(context);
        poke=pokepoke;
    }

    public String getName(){
        return poke.getName();
    }

}

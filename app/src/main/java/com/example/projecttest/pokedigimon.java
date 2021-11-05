package com.example.projecttest;

public class pokedigimon {
    int speed = 0;
    int str = 0;
    int health = 0;
    int def = 0;
    String name = "default";

    public pokedigimon(int newSpeed, int newStrength, int newHealth, int newDefense, String newname) {
        speed = newSpeed;
        str = newStrength;
        health = newHealth;
        def = newDefense;
        name = newname;
    }

    public boolean attack(pokedigimon target)
    {
        System.out.printf("%s attacking %s",this.name,target.name);
        target.health = target.health - (this.str-target.def);
        if(target.health < 1)
            return true;//target.die();
        else
            return false;
    }


}

package com.example.notepc.funfacts;

import java.util.Random;

/**
 * Created by notepc on 25.02.2015.
 */
public class FactBook {

    public String getFact(){
        String[] facts ={
                "Ants strech when they wake up in the morning",
                "Ostrichen can run faster than horses",
                "Olympic gold medals are made mostly of silver",
                "You are born with 300 bones; By the time you will have 206"
        };
        Random random = new Random();
        int randomNumber = random.nextInt(facts.length);
        return facts[randomNumber];
    }
}

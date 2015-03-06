package com.example.notepc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by notepc on 25.02.2015.
 */
public class ColorBook {

    public int getColors(){
        String[] colors ={
        "#39add1", // light blue
        "#3079ab", // dark blue
        "#c25975", // mauve
        "#e15258", // red
        "#f9845b", // orange
        "#838cc7", // lavender
        "#7d669e", // purple
        "#53bbb4", // aqua
        "#51b46d", // green
        "#e0ab18", // mustard
        "#637a91", // dark gray
        "#f092b0", // pink
        "#b7c0c7" // light gray
        };
        Random random = new Random();
        int randomNumber = random.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}

package com.company;

import java.util.Random;

public class Animal {
    int positonX;
    int positonY;
    int speed;
    int happiness;
    int maxHappieness;
    int stomach;
    int maxStomach;
    public Animal (int positonX, int positonY){
        this.positonX=positonX;
        this.positonY=positonY;
    }

    void move (Earth earth) {
        Random r = new Random();
        this.positonX += r.nextInt(speed);
        this.positonY += r.nextInt(speed);
        this.positonX = this.positonX%earth.earthSizeX;
        this.positonY = this.positonY%earth.earthSizeY;

    }
}

package com.company;
abstract class Drapieznik {
    int glod;
    int predkosc;
    int pozycja_x;
    int pozycja_y;
}

public class Main {
    public static void main(String[] args) {
<<<<<<< Updated upstream
	// write your code here
=======

        Earth ziema = new Earth(1000,1000);
	    Tiger bb = new Tiger((int)(Math.random()*ziema.earthSizeX) , (int)(Math.random()*ziema.earthSizeY));
        Tiger cc = new Tiger((int)(Math.random()*ziema.earthSizeX) , (int)(Math.random()*ziema.earthSizeY));
        Vector<Tiger> tigers =new Vector<Tiger>();
        tigers.add(bb);
        tigers.add(cc);

        for (int j=0;j<5;j++) {
            for (int i = 0; i < 2; i++) {
                //Tiger tiger = new Tiger((int) (Math.random() * ziema.earthSizeX), (int) (Math.random() * ziema.earthSizeY));
                Tiger tiger = tigers.get(i);
                tiger.move(ziema);
                System.out.println("tygrys :" + i);
                System.out.println("pozycja x: " + tiger.positonX);
                System.out.println("pozycja y: " + tiger.positonY);
                //System.out.println(Math.random());
            }
        }
>>>>>>> Stashed changes
    }
}

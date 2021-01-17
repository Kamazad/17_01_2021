package com.sda.przyklad1;

public class Main {
    public static void main(String[] args) {


        Tygrys tygrys = new Tygrys();
        tygrys.printOnScreen();
        tygrys.setIlosclap(3);
        tygrys.printOnScreen();

        tygrys = new Tygrys();//nadpisanie nowym tygrysem
        tygrys.setIlosclap(5);

    }
}

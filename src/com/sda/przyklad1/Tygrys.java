package com.sda.przyklad1;

public class Tygrys extends Zwierze {

    public Tygrys() {
        super(4);
    }

    public void printOnScreen() {
        System.out.println("Jestem tygrys i mam :" + getIlosclap() + " łap");
    }

}

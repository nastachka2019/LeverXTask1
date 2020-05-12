package com.leverX.farm.work;

import com.leverX.farm.action.Cleaning;


public class Aviary {
    private int number;
    private Cleaning clean;

    public Aviary(int number, Cleaning clean) {
        this.number = number;
        this.clean = clean;
    }

    public int getNumber() {
        return number;
    }

    public Cleaning getClean() {
        return clean;
    }
}



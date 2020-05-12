package com.leverX.farm.action;

public enum Feeding {
    FULL("is not hungry"),
    HUNGRY("hungry");

    private String state;

    Feeding(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

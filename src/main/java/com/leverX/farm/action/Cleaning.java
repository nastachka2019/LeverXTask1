package com.leverX.farm.action;

public enum Cleaning {
    CLEAN("clean"),
    DIRTY("dirty");

    private String state;

    Cleaning(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

}

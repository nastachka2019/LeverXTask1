package com.leverX.farm.action;

public enum Health {
    HEALTHY("healthy"),
    SICK("sick");

    private String state;

    Health(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

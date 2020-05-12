package com.leverX.farm.action;

public enum Training {
    TRAINED("trained"),
    UNTRAINED("untrained");

    private String state;

    Training(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

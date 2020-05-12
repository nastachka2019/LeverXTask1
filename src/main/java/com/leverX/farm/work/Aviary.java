package com.leverX.farm.work;

import com.leverX.farm.action.Cleaning;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aviary {
    private static final Logger logger = LogManager.getLogger();
    private int number;
    private Cleaning clean;

    public Aviary(int number, Cleaning clean) {
        this.number = number;
        this.clean = clean;
    }

    public int getNumber() {
        return number;
    }

    public void setClean(Cleaning clean) {
        this.clean = clean;
    }
    }



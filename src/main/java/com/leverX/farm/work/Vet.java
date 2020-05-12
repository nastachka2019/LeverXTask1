package com.leverX.farm.work;

import com.leverX.farm.action.Health;
import com.leverX.farm.entity.Dog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vet {
    private static final Logger logger = LogManager.getLogger();
    private String name;

    public Vet() {
    }

    public Vet(String name) {
        this.name = name;
    }

    public void toTreat(Dog dog) {
        if (dog.getHealth() == Health.SICK) {
            logger.info("The Dog " + dog.getName() + " was cured by doctor  " + name);
        } else {
            logger.info("The Dog " + dog.getName() + " is healthy and doesn't need treatment " + name);
        }
    }

    public void checkDog(Dog dog) {
        if (dog.getHealth() == Health.SICK) {
            logger.info("The Dog " + dog.getName() + " is sick");
        }
    }
}

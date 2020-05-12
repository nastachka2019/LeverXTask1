package com.leverX.farm.work;


import com.leverX.farm.action.Cleaning;
import com.leverX.farm.entity.Dog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stuff {
    private static final Logger logger = LogManager.getLogger();
    private String name;
    private String position;

    public Stuff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void train(Dog dog) {
        switch (dog.getTraining()) {
            case TRAINED:
                System.out.println("The dog " + " " + dog.getName() + " " + "was trained !");
                break;
            case UNTRAINED:
                System.out.println("The dog " + " " + dog.getName() + " " + "needs to be trained !");
        }
    }

    public void policeWork(Dog dog) {
        switch (dog.getAge()) {
            case ADULT:
                System.out.println("The dog " + " " + dog.getName() + " " + "is going at work to the police station");
            case OLD:
                System.out.println("The dog " + " " + dog.getName() + " " + "is returning to the aviary");
            case PUPPY:
                System.out.println("The dog " + " " + dog.getName() + " " + "is returning to the aviary");
        }
    }

    public void feed(Dog dog) {
        switch (dog.getFeeding()) {
            case HUNGRY:
               logger.info("The dog " + " " + dog.getName() + " " + "should be fed!");
                break;
            case FULL:
                logger.info("The dog " + " " + dog.getName() + " " + "does not need to be fed, he is not hungry");
        }
    }

    public void cleanAviary(Aviary aviary) {
        if (aviary.getClean() == Cleaning.DIRTY) {
            logger.info("Aviary " + " " + aviary.getNumber() + " " + " was cleaned by " + position + " " + name);
        } else {
            logger.info("Aviary " + " " + aviary.getNumber() + " " + "doesn't need  cleaning");
        }
    }
}

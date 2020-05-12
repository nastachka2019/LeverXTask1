package com.leverX.farm.work;

import com.leverX.farm.action.Health;
import com.leverX.farm.entity.Dog;

public class Vet {
    private String name;


    public Vet(String name) {
        this.name = name;
    }

    public void toTreat(Dog dog) {
      //  dog.setHealth(Health.HEALTHY);
        System.out.println("The Dog " + dog.getName() + " was cured by " + name);
    }

    public void checkDog(Dog dog) {
        if (dog.getHealth() == Health.SICK) {
            System.out.println("The Dog " + dog.getName() + " is sick");
            toTreat(dog);
        } else {
            System.out.println("The Dog " + dog.getName() + " is healthy");
        }
    }
}

package com.leverX.farm.work;


import com.leverX.farm.action.Cleaning;
import com.leverX.farm.entity.Dog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stuff {
    private String name;
    private String position;

    public Stuff(String name, String position) {
        this.name = name;
        this.position=position;
    }
    public void train(Dog dog){
        dog.train();
    }
    public void feed(Dog dog) {
        dog.eat();
    }

    public void cleanAviary(Aviary aviary) {
        aviary.setClean(Cleaning.CLEAN);
        System.out.println("Aviary " + aviary.getNumber() + " was cleaned by " + position +" "+ name);
    }
}

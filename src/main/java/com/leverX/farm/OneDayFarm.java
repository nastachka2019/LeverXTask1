package com.leverX.farm;

import com.leverX.farm.action.Cleaning;
import com.leverX.farm.action.Feeding;
import com.leverX.farm.action.Health;
import com.leverX.farm.action.Training;
import com.leverX.farm.entity.*;
import com.leverX.farm.work.Aviary;
import com.leverX.farm.work.Stuff;
import com.leverX.farm.work.Vet;

import java.util.ArrayList;
import java.util.List;

public class OneDayFarm {
    public void createOneDayFarm() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog.Builder()
                .setAge(DogAge.PUPPY)
                .setName("Max")
                .setFeeding(Feeding.HUNGRY)
                .setHealth(Health.HEALTHY)
                .setTraining(Training.TRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.PUPPY)
                .setName("Mila")
                .setFeeding(Feeding.FULL)
                .setHealth(Health.SICK)
                .setTraining(Training.UNTRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.ADULT)
                .setName("Mery")
                .setFeeding(Feeding.HUNGRY)
                .setHealth(Health.SICK)
                .setTraining(Training.TRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.PUPPY)
                .setName("Rex")
                .setFeeding(Feeding.HUNGRY)
                .setHealth(Health.HEALTHY)
                .setTraining(Training.TRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.OLD)
                .setName("Della")
                .setFeeding(Feeding.HUNGRY)
                .setHealth(Health.HEALTHY)
                .setTraining(Training.TRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.OLD)
                .setName("Marley")
                .setFeeding(Feeding.FULL)
                .setHealth(Health.SICK)
                .setTraining(Training.UNTRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.PUPPY)
                .setName("Jack")
                .setFeeding(Feeding.FULL)
                .setHealth(Health.HEALTHY)
                .setTraining(Training.UNTRAINED)
                .build());
        dogs.add(new Dog.Builder()
                .setAge(DogAge.ADULT)
                .setName("Kate")
                .setFeeding(Feeding.HUNGRY)
                .setHealth(Health.SICK)
                .setTraining(Training.UNTRAINED)
                .build());

        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(new Aviary(1, Cleaning.CLEAN));
        aviaries.add(new Aviary(2, Cleaning.DIRTY));
        aviaries.add(new Aviary(3, Cleaning.DIRTY));
        aviaries.add(new Aviary(4, Cleaning.CLEAN));
        aviaries.add(new Aviary(5, Cleaning.DIRTY));
        aviaries.add(new Aviary(6, Cleaning.CLEAN));
        aviaries.add(new Aviary(7, Cleaning.CLEAN));


        Vet vet = new Vet("Adam");
        Stuff stuff = new Stuff("Andrew", "worker");


        for (Dog dog : dogs) {
            stuff.feed(dog);
            vet.checkDog(dog);
            stuff.train(dog);
            dog.policeWork();
            vet.toTreat(dog);
        }

        for (Aviary aviary : aviaries) {
            stuff.cleanAviary(aviary);
        }
    }
}

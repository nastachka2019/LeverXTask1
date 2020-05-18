package com.leverX.farm;

import com.leverX.farm.action.Cleaning;
import com.leverX.farm.action.Feeding;
import com.leverX.farm.action.Health;
import com.leverX.farm.action.Training;
import com.leverX.farm.entity.*;
import com.leverX.farm.stuff.Aviary;
import com.leverX.farm.stuff.Stuff;
import com.leverX.farm.stuff.Vet;


import java.util.ArrayList;
import java.util.List;

public class OneDayFarm {
    public void createOneDayFarm() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog.Builder("Max", DogAge.PUPPY, Feeding.FULL, Health.SICK, Training.UNTRAINED).build());
        dogs.add(new Dog.Builder("Mila", DogAge.PUPPY, Feeding.FULL, Health.SICK, Training.UNTRAINED).build());
        dogs.add(new Dog.Builder("Mery", DogAge.ADULT, Feeding.HUNGRY, Health.SICK, Training.TRAINED).build());
        dogs.add(new Dog.Builder("Rex", DogAge.PUPPY, Feeding.HUNGRY, Health.HEALTHY, Training.TRAINED).build());
        dogs.add(new Dog.Builder("Della", DogAge.OLD, Feeding.HUNGRY, Health.HEALTHY, Training.TRAINED).build());
        dogs.add(new Dog.Builder("Marley", DogAge.OLD, Feeding.FULL, Health.SICK, Training.UNTRAINED).build());
        dogs.add(new Dog.Builder("Jack", DogAge.PUPPY, Feeding.FULL, Health.HEALTHY, Training.UNTRAINED).build());
        dogs.add(new Dog.Builder("Kate", DogAge.ADULT, Feeding.HUNGRY, Health.SICK, Training.UNTRAINED).build());

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
            stuff.policeWork(dog);
            vet.toTreat(dog);
        }

        for (Aviary aviary : aviaries) {
            stuff.cleanAviary(aviary);
        }
    }
}

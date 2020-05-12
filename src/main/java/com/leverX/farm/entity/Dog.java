package com.leverX.farm.entity;

import com.leverX.farm.action.Feeding;
import com.leverX.farm.action.Health;
import com.leverX.farm.action.Training;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog {
    private static final Logger logger = LogManager.getLogger();
    private String name;
    private DogAge age;
    private Feeding feeding;
    private Health health;
    private Training training;

    public Dog(String name, DogAge age, Health health, Feeding feeding, Training training) {
        this.name = name;
        this.age = age;
        this.feeding = feeding;
        this.health = health;
        this.training = training;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public DogAge getAge() {
        return age;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public Health getHealth() {
        return health;
    }

    public Training getTraining() {
        return training;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return (age == dog.age || (age != null && age.equals(dog.getAge()))) &&
                (name == dog.name || (name != null && name.equals(dog.getName()))) &&
                (feeding == dog.feeding || (feeding != null && feeding.equals(dog.getFeeding()))) &&
                (health == dog.health || (health != null && health.equals(dog.getHealth()))) &&
                (training == dog.training || (training != null && training.equals(dog.getTraining())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((feeding == null) ? 0 : feeding.hashCode());
        result = prime * result + ((training == null) ? 0 : training.hashCode());
        result = prime * result + ((health == null) ? 0 : health.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Dog{" + "age=" + " " + age + ", name=" + " " + name + ", feed=" + " " + feeding.getState() +
                ", health=" + " " + health.getState() + ", training=" + " " + training.getState() + "}");
        return str.toString();
    }

    public void eat() {
        switch (feeding) {
            case HUNGRY:
                System.out.println("The dog " + " " + getName() + " " + "should be fed!");
                break;
            case FULL:
                System.out.println("The dog " + " " + getName() + " " + "does not need to be fed, he is not hungry");
        }
    }

    public void train() {
        switch (training) {
            case TRAINED:
                System.out.println("The dog " + " " + getName() + " " + "was trained !");
                break;
            case UNTRAINED:
                System.out.println("The dog " + " " + getName() + " " + "needs to be trained !");
        }
    }

    public void treat() {
        switch (health) {
            case SICK:
                System.out.println("The dog " + " " + getName() + " " + "needs to be treat !");
                break;
            case HEALTHY:
                System.out.println("The dog " + " " + getName() + " " + "is healthy!");
        }
    }

    public void policeWork() {
        switch (age) {
            case ADULT:
                System.out.println("The dog " + " " + getName() + " " + "is going at work to the police station");
            case OLD:
                System.out.println("The dog " + " " + getName() + " " + "is returning to the aviary");

            case PUPPY:
                System.out.println("The dog " + " " + getName() + " " + "is returning to the aviary");
        }
    }


    public static class Builder {
        private Dog dog;

        public Builder() {
            dog = new Dog();
        }

        public Builder setName(String name) {
            dog.name = name;
            return this;
        }

        public Builder setAge(DogAge age) {
            dog.age = age;
            return this;
        }

        public Builder setFeeding(Feeding feeding) {
            dog.feeding = feeding;
            return this;
        }

        public Builder setHealth(Health health) {
            dog.health = health;
            return this;
        }

        public Builder setTraining(Training training) {
            dog.training = training;
            return this;
        }

        public Dog build() {
            return dog;
        }
    }
}

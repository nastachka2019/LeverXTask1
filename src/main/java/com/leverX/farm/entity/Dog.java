package com.leverX.farm.entity;

import com.leverX.farm.action.Feeding;
import com.leverX.farm.action.Health;
import com.leverX.farm.action.Training;


public class Dog {

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

    public static class Builder {
        private String name;
        private DogAge age;
        private Feeding feeding;
        private Health health;
        private Training training;

        public Builder(String name, DogAge age, Feeding feeding, Health health, Training training) {
            this.name = name;
            this.age = age;
            this.feeding = feeding;
            this.health = health;
            this.training = training;
        }

        public Dog build() {
            return new Dog(this) {
            };
        }
    }

    private Dog(Builder builder) {
        name = builder.name;
        age = builder.age;
        feeding = builder.feeding;
        health = builder.health;
        training = builder.training;
    }
}


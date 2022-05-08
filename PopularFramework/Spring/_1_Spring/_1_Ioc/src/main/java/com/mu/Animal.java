package com.mu;

public class Animal {
    private String animalName;
    private String animalSpeak;

    public Animal() {
    }

    public Animal(String animalName, String animalSpeak) {
        this.animalName = animalName;
        this.animalSpeak = animalSpeak;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalSpeak(String animalSpeak) {
        this.animalSpeak = animalSpeak;
    }

    public void speak(){
        System.out.println(animalName + " " + animalSpeak);
    }
}

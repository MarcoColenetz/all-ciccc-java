package main;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal() {
        this.height = 50;
        this.weight = 30;
        this.animalType = "Mammals";
        this.bloodType = "A";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String toString() {
        return "Animal info:";
    }
}

package com.example.demo;
import java.lang.String;
public class PetadoptionUML {
    public String pet_name;
    public int pet_age;
    public String pet_shelter;
    public String pet_type;

    public PetadoptionUML() {
    }

    public PetadoptionUML(String pet_name, int pet_age, String pet_shelter, String pet_type) {
        this.pet_name = pet_name;
        this.pet_age = pet_age;
        this.pet_shelter = pet_shelter;
        this.pet_type = pet_type;
    }

    // Getters and setters

    public String getPetname() {
        return pet_name;
    }

    public void setPetname(String pet_name) {
        this.pet_name = pet_name;
    }

    public int getAge() {
        return pet_age;
    }

    public void setPet_age(int pet_age) {
        this.pet_age = pet_age;
    }

    public String getpet_shelter() {
        return pet_shelter;
    }

    public void setpet_shelter(String pet_shelter) {
        this.pet_shelter = pet_shelter;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }



    @Override
    public String toString() {
        return "Pets{" +
                "Name=" + pet_name +
                ", Age='" + pet_age + '\'' +
                ", Shelter=" + pet_shelter +
                ", Type'" + pet_type + '\'' +
                '}';
    }

}
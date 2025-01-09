package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository= petRepository;
    }

    public List<PetadoptionUML> getAllpets() {
        return petRepository.getAllPETS();
    }

    public void addPet(PetadoptionUML newPet) {
        petRepository.addPet(newPet);
    }

    public PetadoptionUML getPetDetails(String pet_name) {
        // validation
        return petRepository.getPetinfo(pet_name);
    }


}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("pets")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public String getAll(Model model) {
        List<PetadoptionUML> pets = petService.getAllpets();
        model.addAttribute("pets", pets);
        return "books";
    }

    @PostMapping
    public String addPet(@ModelAttribute("newPet") PetadoptionUML newPet) {
        petService.addPet(newPet);
        return "redirect:/pets";
    }

    @GetMapping("pet_name")
    public String getPetDetails(@PathVariable("pet_name") String pet_name, Model model) {
        PetadoptionUML pet = petService.getPetDetails(pet_name);
        model.addAttribute("PET", pet);
        return "books";
    }

    @GetMapping("available_pets")
    public String getAvailablePets(Model model) {
        List<PetadoptionUML> pets = petService.getAllpets();
        model.addAttribute("PETS", pets);
        return "availablepets";
    }

    @GetMapping("loginpage")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("contactpage")
    public String showContactPage() {
        return "contact";
    }

    @GetMapping("homepage")
    public String showHomePage() {
        return "homepage";
    }

    @GetMapping("adoptionprocesspage")
    public String showProcessPage() {
        return "adoptionprocess";
    }

    @GetMapping("formpage")
    public String ShowFormPage() {
        return "fm";
    }
}



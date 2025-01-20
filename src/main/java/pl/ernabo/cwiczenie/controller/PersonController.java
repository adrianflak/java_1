package pl.ernabo.cwiczenie.controller;

import pl.ernabo.cwiczenie.model.Person;
import pl.ernabo.cwiczenie.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PersonController {
    @Autowired
    private PersonRepository PersonRepository;

    @GetMapping("/")
    public String showPage(Model model) {
        model.addAttribute("allPersons", PersonRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addPerson(@RequestParam String name, Model model) {
        Person newPerson = new Person(name);
        PersonRepository.save(newPerson);
        return "redirect:/";
    }

}
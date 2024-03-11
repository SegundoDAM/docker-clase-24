package com.adorno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.model.Persona;
import com.adorno.model.PersonaRepository;

@RestController
public class PersonaController {

    private final PersonaRepository personaRepository;


    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping("all")
    public List<Persona> getAll(){
        return personaRepository.findAll();
    }

    @PostMapping("one")
    public boolean addOne(@RequestBody Persona persona){
        return personaRepository.save(persona)!=null;
    }
}

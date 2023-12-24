package com.proyect.persona.controllers;

import com.proyect.persona.entities.Persona;

import com.proyect.persona.services.BaseServiceImpl;
import com.proyect.persona.services.PersonaServiceImpl;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}

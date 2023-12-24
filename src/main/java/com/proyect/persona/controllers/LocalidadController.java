package com.proyect.persona.controllers;

import com.proyect.persona.entities.Localidad;
import com.proyect.persona.services.LocalidadServicempl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServicempl> {
}

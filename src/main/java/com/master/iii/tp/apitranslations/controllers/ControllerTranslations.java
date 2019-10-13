package com.master.iii.tp.apitranslations.controllers;



import com.master.iii.tp.apitranslations.entities.Translations;

import com.master.iii.tp.apitranslations.services.translations.services.ServiceTranslation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/applications/")
public class ControllerTranslations {

    @Autowired
    ServiceTranslation serviceTranslation;


    @PostMapping(path = "{id}/transaltions")
   public  ResponseEntity createTranslation( @RequestBody @Valid Translations translations){

        return new ResponseEntity<>(serviceTranslation.createTranslation(translations), HttpStatus.CREATED);

    }
}




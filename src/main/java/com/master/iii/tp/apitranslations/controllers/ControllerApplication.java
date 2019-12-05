package com.master.iii.tp.apitranslations.controllers;


import com.master.iii.tp.apitranslations.entities.Application;
import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/applications")
public class ControllerApplication
{
    @Autowired
    ServiceApp appService;

    @PostMapping
    public ResponseEntity createApplication(@RequestBody @Valid Application application){

       Application headers = appService.createApplication(application);

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}

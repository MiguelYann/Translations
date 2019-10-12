package com.master.iii.tp.apitranslations.controllers;


import com.master.iii.tp.apitranslations.entities.Applications;
import com.master.iii.tp.apitranslations.services.applicationServices.serviceApp.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/applications")
public class controllerApplication
{
    @Autowired
    ServiceApp appService;
    @PostMapping
    public ResponseEntity createApplication(@RequestBody @Valid Applications application){

        //!TODO Implement when user also exists print message error

        /*
               if(appService.findApplicationById(application.getId()).isPresent()){
      return ResponseEntity.status(400).body("Already exist");
        }
               */

       Applications headers = appService.createApplication(application);

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}

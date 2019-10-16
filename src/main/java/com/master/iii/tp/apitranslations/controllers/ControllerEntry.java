package com.master.iii.tp.apitranslations.controllers;


import com.master.iii.tp.apitranslations.entities.Entry;
import com.master.iii.tp.apitranslations.services.entry.services.ServiceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/applications/{idApplication}/translations/{idTranslations}/entries")
public class ControllerEntry {
    @Autowired
    ServiceEntry serviceEntry;



    @GetMapping(path = "/{id}")
    public ResponseEntity getEntry(@PathVariable Integer id){
        Optional <Entry> entry = serviceEntry.getEntry(id);
        if(entry.isPresent()){
            return ResponseEntity.ok(entry.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }


    }

    /**
     *
     */

    @DeleteMapping(path = "/{id}")

    public ResponseEntity deleteEntry(@PathVariable Integer id){

        serviceEntry.deleteEntry(id);
        return ResponseEntity.status(200).body("Entry " + id + " est bien supprimeé");

    }
}

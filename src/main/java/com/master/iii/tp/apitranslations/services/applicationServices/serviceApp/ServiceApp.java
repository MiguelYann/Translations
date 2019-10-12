package com.master.iii.tp.apitranslations.services.applicationServices.serviceApp;

import com.master.iii.tp.apitranslations.entities.Applications;

import java.util.Optional;

public interface ServiceApp
 {
   Applications createApplication(Applications applications);
   Optional<Applications> findApplicationById(Integer id);

 }

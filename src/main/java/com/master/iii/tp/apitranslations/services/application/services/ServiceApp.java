package com.master.iii.tp.apitranslations.services.application.services;

import com.master.iii.tp.apitranslations.entities.Application;

import java.util.Optional;

public interface ServiceApp
 {
   Application createApplication(Application applications);
   Optional<Application> findApplicationById(Integer id);

 }

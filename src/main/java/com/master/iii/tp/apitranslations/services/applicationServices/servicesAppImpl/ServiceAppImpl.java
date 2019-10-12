package com.master.iii.tp.apitranslations.services.applicationServices.servicesAppImpl;

import com.master.iii.tp.apitranslations.entities.Applications;
import com.master.iii.tp.apitranslations.repositories.ApplicationRepository;
import com.master.iii.tp.apitranslations.services.applicationServices.serviceApp.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceAppImpl implements ServiceApp {

    @Autowired
    ApplicationRepository applicationRepository;
    @Override
    public Applications createApplication(Applications currentApplication){
        currentApplication = applicationRepository.save(currentApplication);
        return currentApplication;

    }

    @Override
    public Optional<Applications> findApplicationById(Integer id) {
        return applicationRepository.findById(id);
    }
}

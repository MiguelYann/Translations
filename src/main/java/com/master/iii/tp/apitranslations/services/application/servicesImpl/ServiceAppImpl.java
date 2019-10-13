package com.master.iii.tp.apitranslations.services.application.servicesImpl;

import com.master.iii.tp.apitranslations.entities.Application;
import com.master.iii.tp.apitranslations.repositories.ApplicationRepository;
import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceAppImpl implements ServiceApp {

    @Autowired
    ApplicationRepository applicationRepository;
    @Override
    public Application createApplication(Application currentApplication){
        currentApplication.setId(null);
        currentApplication = applicationRepository.save(currentApplication);
        return currentApplication;

    }

    @Override
    public Optional<Application> findApplicationById(Integer id) {
        return applicationRepository.findById(id);
    }
}

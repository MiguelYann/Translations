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


    /**
     *
     * @param currentApplication the application that we pass at body
     * @return the application which is save by CrudRepo
     */
    @Override
    public Application createApplication(Application currentApplication){
        if(applicationRepository.findAll().equals(currentApplication)){
            currentApplication.setId(null);
            return currentApplication;

        }
        else {
            currentApplication = applicationRepository.save(currentApplication);
            return currentApplication;
        }
    }

    /**
     *
     * @param id take the current id of application
     * @return
     */

    @Override
    public Optional<Application> findApplicationById(Integer id) {
        return applicationRepository.findById(id);
    }
}

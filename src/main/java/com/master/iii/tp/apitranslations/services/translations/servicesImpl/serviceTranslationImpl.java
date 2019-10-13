package com.master.iii.tp.apitranslations.services.translations.servicesImpl;

import com.master.iii.tp.apitranslations.entities.Application;
import com.master.iii.tp.apitranslations.entities.Translations;
import com.master.iii.tp.apitranslations.repositories.ApplicationRepository;
import com.master.iii.tp.apitranslations.repositories.TranslationRepository;
import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
import com.master.iii.tp.apitranslations.services.translations.services.ServiceTranslation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class serviceTranslationImpl implements ServiceTranslation {

    @Autowired
    TranslationRepository translationRepository;
    @Autowired
    ServiceApp serviceApp;



    @Override
   public Translations createTranslation(Translations translations){
        translations.setId(null);
        System.out.println(translations.getId());
        translations = translationRepository.save(translations);
        return translations;

    }


}

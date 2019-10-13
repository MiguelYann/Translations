package com.master.iii.tp.apitranslations.repositories;

import com.master.iii.tp.apitranslations.entities.Translations;
import org.springframework.data.repository.CrudRepository;

public interface TranslationRepository extends CrudRepository<Translations,Integer> {
}

package com.master.iii.tp.apitranslations.repositories;

import com.master.iii.tp.apitranslations.entities.Entry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends CrudRepository<Entry, Integer> {
}

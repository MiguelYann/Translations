package com.master.iii.tp.apitranslations.services.entry.serviceImpl;

import com.master.iii.tp.apitranslations.entities.Entry;
import com.master.iii.tp.apitranslations.repositories.EntryRepository;
import com.master.iii.tp.apitranslations.services.entry.services.ServiceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceEntryImpl implements ServiceEntry {


    @Autowired
    EntryRepository entryRepository;


    @Override
    public Optional<Entry> getEntry(Integer id) {
        return entryRepository.findById(id);
    }

    @Override
    public void deleteEntry(Integer id){ entryRepository.deleteById(id);}
}

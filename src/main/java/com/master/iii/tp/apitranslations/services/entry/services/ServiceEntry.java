package com.master.iii.tp.apitranslations.services.entry.services;

import com.master.iii.tp.apitranslations.entities.Entry;

import java.util.Optional;

public interface ServiceEntry
{
    Optional<Entry> getEntry(Integer id);

    void deleteEntry(Integer id);

    Entry updateEntry(Entry id);

}

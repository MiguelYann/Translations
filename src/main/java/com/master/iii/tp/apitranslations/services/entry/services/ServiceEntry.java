package com.master.iii.tp.apitranslations.services.entry.services;

import com.master.iii.tp.apitranslations.entities.Entry;

import java.util.Optional;

public interface ServiceEntry
{
   public Optional<Entry> getEntry(Integer id);
}
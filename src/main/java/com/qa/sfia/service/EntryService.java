package com.qa.sfia.service;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.exceptions.EntryNotFoundException;
import com.qa.sfia.repo.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    private final EntryRepository repo;

    @Autowired
    public EntryService(EntryRepository repo) {
        this.repo = repo;
    }

    public List<Entry> readAllEntries() {
        return this.repo.findAll();
    }

    public Entry createEntry(Entry entry){
        return this.repo.save(entry);
    }

    public Entry findEntryById(Long id){
        return this.repo.findById(id).orElseThrow(EntryNotFoundException::new);
    }

    public Entry updateEntry(Long id, Entry entry){
        Entry update = findEntryById(id);
        update.setDescription(entry.getDescription());
        return this.repo.save(update);
    }

    public Boolean deleteEntryById(Long id){
        if(!this.repo.existsById(id)){
            throw new EntryNotFoundException();
        }
        this.repo.deleteById(id);
        return.this.repo.existsById(id);
    }

}

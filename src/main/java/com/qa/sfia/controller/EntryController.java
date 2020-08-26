package com.qa.sfia.controller;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntryController {

    private final EntryService entryService;

    @Autowired
    public EntryController(EntryService entryService){
        this.entryService = entryService;
    }

    @GetMapping("/")
    public List<Entry> getAllEntries(){
        return this.entryService.readAllEntries();
    }

    @PostMapping("/createEntry")
    public Entry createNote(@RequestBody Entry entry){
        return this.entryService.createEntry(entry);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteEntry(@PathVariable Long id){
        return this.entryService.deleteEntryById(id);
    }

    @GetMapping("/getEntryById/{id}")
    public Entry getEntryById(@PathVariable Long id){
        return this.entryService.findEntryById(id);
    }

    @PutMapping("/updateEntry/{id}")
    public Entry updateEntry(@PathVariable Long id, @RequestBody Entry entry){
        return this.entryService.updateEntry(id, entry);
    }
}

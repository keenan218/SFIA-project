package com.qa.sfia.controller;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.service.EntryService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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
    public Entry createEntry(@RequestBody Entry entry){
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
    @PutMapping("/updateEntryWithPathParam")
    public Entry updateEntryWithPathParam(@PathParam("id") Long id, @RequestBody Entry entry){
        // localhost:8080/updateEntryWithPathParam?id=1
        return this.entryService.updateEntry(id, entry);
    }
}

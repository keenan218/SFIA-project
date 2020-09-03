package com.qa.sfia.controller;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.dto.EntryDTO;
import com.qa.sfia.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<EntryDTO>> getAllEntries(){
        return ResponseEntity.ok(this.entryService.readAllEntries());
    }

    @PostMapping("/createEntry")
    public ResponseEntity<EntryDTO> createEntry(@RequestBody Entry entry){
        return new ResponseEntity<EntryDTO>(this.entryService.createEntry(entry), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEntry(@PathVariable Long id){
        return this.entryService.deleteEntryById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/getEntryById/{id}")
    public ResponseEntity<EntryDTO> getEntryById(@PathVariable Long id){
        return ResponseEntity.ok(this.entryService.findEntryById(id));
    }

    @PutMapping("/updateEntry/{id}")
    public ResponseEntity<EntryDTO> updateEntry(@PathVariable Long id, @RequestBody Entry entry){
        return ResponseEntity.ok(this.entryService.updateEntry(id, entry));
    }
    @PutMapping("/updateEntryWithPathParam")
    public ResponseEntity<EntryDTO> updateEntryWithPathParam(@PathParam("id") Long id, @RequestBody Entry entry){
        // localhost:8080/updateEntryWithPathParam?id=1
        return ResponseEntity.ok(this.entryService.updateEntry(id, entry));
    }
}

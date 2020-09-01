package com.qa.sfia.service;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.dto.EntryDTO;
import com.qa.sfia.exceptions.EntryNotFoundException;
import com.qa.sfia.repo.EntryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryService {

    private final EntryRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public EntryService(EntryRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
    private EntryDTO mapToDTO(Entry entry){
        return this.mapper.map(entry, EntryDTO.class);
    }

    public List<EntryDTO> readAllEntries() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public EntryDTO createEntry(Entry entry){
        return this.mapToDTO(this.repo.save(entry));
    }

    public EntryDTO findEntryById(Long id){
        return this.mapToDTO(this.repo.findById(id)
                .orElseThrow(EntryNotFoundException::new));
    }

    public EntryDTO updateEntry(Long id, Entry entry){
        Entry update = this.repo.findById(id).orElseThrow(EntryNotFoundException::new);
        update.setDescription(entry.getDescription());
        return this.mapToDTO(this.repo.save(entry));
    }

    public Boolean deleteEntryById(Long id){
        if(!this.repo.existsById(id)){
            throw new EntryNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}

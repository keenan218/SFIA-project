package com.qa.sfia.service;

import com.qa.sfia.domain.WishList;
import com.qa.sfia.dto.WishListDTO;
import com.qa.sfia.exceptions.EntryNotFoundException;
import com.qa.sfia.exceptions.WishListNotFoundException;
import com.qa.sfia.repo.WishListRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.modelmapper.Converters.Collection.map;

@Service
public class WishListService {

    private final WishListRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public WishListService(WishListRepository repo, ModelMapper mapper){
        this.repo = repo;
        this.mapper = mapper;
    }
    private WishListDTO mapToDTO(WishList wishList){
        return this.mapper.map(wishList, WishListDTO.class);
    }

    public List<WishListDTO> readAllWishLists() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public WishListDTO createWishList(WishList wishList){
        return this.mapToDTO(this.repo.save(wishList));
    }

    public WishListDTO findWishListById(Long id){
        return this.mapToDTO(this.repo.findById(id).orElseThrow(WishListNotFoundException::new));
    }

    public WishListDTO updateWishList(Long id, WishList wishList){
        WishList update = this.repo.findById(id).orElseThrow(WishListNotFoundException::new);
        update.setTitle(wishList.getTitle());
        return this.mapToDTO(this.repo.save(update));
    }

    public Boolean deleteWishListById(Long id){
        if(!this.repo.existsById(id)){
            throw new EntryNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}

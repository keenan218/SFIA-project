package com.qa.sfia.service;

import com.qa.sfia.domain.WishList;
import com.qa.sfia.exceptions.WishListNotFoundException;
import com.qa.sfia.repo.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    private final WishListRepository repo;

    @Autowired
    public WishListService(WishListRepository repo){
        this.repo = repo;
    }

    public List<WishList> readAllWishLists() {
        return this.repo.findAll();
    }

    public WishList createWishList(WishList wishList){
        return this.repo.save(wishList);
    }

    public WishList findWishListById(Long id){
        return this.repo.findById(id).orElseThrow(WishListNotFoundException::new);
    }

    public WishList updateWishList(Long id, WishList wishList){
        WishList update = findWishListById(id);
        update.setTitle(wishList.getTitle());
        return this.repo.save(update);
    }

    public Boolean deleteWishListById(Long id){
        if(!this.repo.existsById(id)){
            throw new WishListNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}

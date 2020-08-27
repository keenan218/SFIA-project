package com.qa.sfia.controller;

import com.qa.sfia.domain.Entry;
import com.qa.sfia.domain.WishList;
import com.qa.sfia.service.EntryService;
import com.qa.sfia.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WishListController {

    private final WishListService wishListService;

    @Autowired
    public WishListController(WishListService wishListService){
        this.wishListService = wishListService;
    }

    @GetMapping("/wl/")
    public List<WishList> getAllWishLists(){
        return this.wishListService.readAllWishLists();
    }
    @PostMapping("/wl/createWishList")
    public WishList createWishList(@RequestBody WishList wishList){
        return this.wishListService.createWishList(wishList);
    }

    @DeleteMapping("/wl/delete/{id}")
    public Boolean deleteWishList(@PathVariable Long id){
        return this.wishListService.deleteWishListById(id);
    }
    @GetMapping("/wl/getWishListById/{id}")
    public WishList getWishListById(@PathVariable Long id){
        return this.wishListService.findWishListById(id);
    }

    @PutMapping("/wl/updateWishList/{id}")
    public WishList updateWishList(@PathVariable Long id, @RequestBody WishList wishList){
        return this.wishListService.updateWishList(id, wishList);
    }

}

package com.qa.sfia.controller;

import com.qa.sfia.domain.WishList;
import com.qa.sfia.dto.WishListDTO;
import com.qa.sfia.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WishListController {

    private final WishListService wishListService;

    @Autowired
    public WishListController(WishListService wishListService){
        this.wishListService = wishListService;
    }

    @GetMapping("/wl/getAllWishLists")
    public ResponseEntity<List<WishListDTO>> getAllWishLists(){
        return ResponseEntity.ok(this.wishListService.readAllWishLists());
    }

    @PostMapping("/wl/createWishList")
    public ResponseEntity<WishListDTO> createWishList(@RequestBody WishList wishList){
        return new ResponseEntity<WishListDTO>(this.wishListService.createWishList(wishList), HttpStatus.CREATED);
    }

    @DeleteMapping("/wl/deleteWishList/{id}")
    public Boolean deleteWishLists(@PathVariable Long id){
        return this.wishListService.deleteWishListById(id);
    }
    @GetMapping("/wl/getWishListById/{id}")
    public ResponseEntity<WishListDTO> getWishListById(@PathVariable Long id){
        return ResponseEntity.ok(this.wishListService.findWishListById(id));
    }

    @PutMapping("/wl/updateWishList/{id}")
    public ResponseEntity<WishListDTO> updateWishList(@PathVariable Long id, @RequestBody WishList wishList){
        return ResponseEntity.ok(this.wishListService.updateWishList(id, wishList));
    }

}

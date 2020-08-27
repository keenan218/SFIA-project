package com.qa.sfia.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The Wishlist by this ID doesn't exist")
public class WishListNotFoundException extends EntityNotFoundException {
}

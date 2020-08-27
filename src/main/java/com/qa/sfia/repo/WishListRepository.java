package com.qa.sfia.repo;

import com.qa.sfia.domain.WishList;
import org.springframework.data.jpa.repository.JpaRepository;



public interface WishListRepository extends JpaRepository<WishList, Long> {

}

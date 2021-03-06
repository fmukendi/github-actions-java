package com.mukeapps.unittesting.unittesting.controller;


import com.mukeapps.unittesting.unittesting.model.Item;
import com.mukeapps.unittesting.unittesting.service.ItemBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemBusinessService itemBusinessService;


    @GetMapping("/dummy-item")
    public Item dummyItem(){

        return new Item( 1, "Ball", 10, 100);
    }


    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService(){

        return itemBusinessService.retrieveSampleItem();
    }

    @GetMapping("/get-all-items-from-database")
    public List<Item> getAllItemsFromDatabase(){

        return itemBusinessService.retrieveAllItems();
    }
}

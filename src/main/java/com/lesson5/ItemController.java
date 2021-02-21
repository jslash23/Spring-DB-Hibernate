package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ItemController {

    private DAO dao;
    @Autowired
    /*public ItemController(DAO dao) {
        this.dao = dao;
    }*/

    public ItemController() {

    }


    @PostMapping("/save")
   ResponseEntity <String> save(@RequestBody Item item) {

        item.setDescription("testing item table");
        dao.save(item);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}

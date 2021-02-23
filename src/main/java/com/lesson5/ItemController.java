// This is a personal academic project. Dear PVS-Studio, please check it.

// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com

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
    public ItemController(DAO dao) {
        this.dao = dao;
    }




    @RequestMapping ( method = RequestMethod.POST,
            value = "/save",  produces = MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody
   ResponseEntity <String> save(@RequestBody Item item) {

        item.setDescription("testing item table huyka");
        dao.save(item);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}

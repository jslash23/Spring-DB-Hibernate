package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    private DAO dao;
    @Autowired
    /*public ItemController(DAO dao) {
        this.dao = dao;
    }*/

    public ItemController() {

    }


    @RequestMapping(method = RequestMethod.POST, value = "/save", produces = "text/plain",
            consumes =  MediaType.APPLICATION_JSON_VALUE)


   ResponseEntity <String> save(@RequestBody Item item) {

        item.setDescription("testing item table");
        dao.save(item);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}

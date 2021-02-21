package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private DAO dao;
    @Autowired
    /*public TestController(DAO dao) {
        this.dao = dao;
    }*/


    public void ItemController() {

    }

    @PostMapping("/save-item")
    public @ResponseBody
    String saveOrder() {
        Item item = new Item();
        item.setDescription("testing item table");
        dao.save(item);
        return "ok";
    }
}

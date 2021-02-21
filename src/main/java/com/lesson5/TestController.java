package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private DAO dao;
    @Autowired
    public TestController(@Qualifier("Dao") DAO dao,
                          @Qualifier("DAO") DAO dao1) {
        this.dao = dao;
        this.dao = dao1;
    }

    public TestController() {

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

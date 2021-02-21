// This is a personal academic project. Dear PVS-Studio, please check it.

// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com

package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private DAO dao;
    @Autowired
    public TestController( DAO dao ) {
        this.dao = dao;

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

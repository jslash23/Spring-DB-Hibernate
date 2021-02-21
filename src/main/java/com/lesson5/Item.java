// This is a personal academic project. Dear PVS-Studio, please check it.

// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com

package com.lesson5;

import javax.persistence.*;

@Entity
@Table(name = "ITEMN")

public class Item {
    private Long  id;
    private String description;

    @Id
    @SequenceGenerator(name = "ITEMN_SEQ", sequenceName = "ITEMN_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEMN_SEQ")
    public Long getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

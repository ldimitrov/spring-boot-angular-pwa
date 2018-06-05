package com.ldimitrov.pwa.beer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Beer {

    public Beer(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
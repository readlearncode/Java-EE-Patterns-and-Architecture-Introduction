package com.readlearncode.mvc;

import javax.enterprise.inject.Model;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Model
public class User {

    private String name;

    public User() {
        this.name = "John Smith";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
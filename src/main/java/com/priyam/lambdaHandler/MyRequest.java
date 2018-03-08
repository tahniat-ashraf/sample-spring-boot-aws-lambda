package com.priyam.lambdaHandler;

import java.io.Serializable;

/**
 * Created by dni_tahniat on 3/8/2018.
 */
public class MyRequest implements Serializable{

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

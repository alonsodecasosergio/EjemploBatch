package com.gp.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * 
 * @author salonsodecaso
 *
 */
public class DataIn implements Serializable {

    private String text1;

    private String text2;

    public DataIn() {
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}

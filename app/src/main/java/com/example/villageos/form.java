package com.example.villageos;

public class form {
String NAME,RATE,SUGG;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getRATE() {
        return RATE;
    }

    public void setRATE(String RATE) {
        this.RATE = RATE;
    }

    public String getSUGG() {
        return SUGG;
    }

    public void setSUGG(String SUGG) {
        this.SUGG = SUGG;
    }

    public form() {
    }

    public form(String NAME, String RATE, String SUGG) {
        this.NAME = NAME;
        this.RATE = RATE;
        this.SUGG = SUGG;
    }
}
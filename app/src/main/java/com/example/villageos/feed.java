package com.example.villageos;

public class feed {
    String RATING,SUGGESION;

    public String getRATING() {
        return RATING;
    }

    public void setRATING(String RATING) {
        this.RATING = RATING;
    }

    public String getSUGGESION() {
        return SUGGESION;
    }

    public void setSUGGESION(String SUGGESION) {
        this.SUGGESION = SUGGESION;
    }

    public feed() {
    }

    public feed(String RATING, String SUGGESION) {
        this.RATING = RATING;
        this.SUGGESION = SUGGESION;
    }
}

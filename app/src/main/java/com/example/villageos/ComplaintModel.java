package com.example.villageos;

public class ComplaintModel {
    String type, desc, image;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ComplaintModel() {
    }

    public ComplaintModel(String type, String desc, String image) {
        this.type = type;
        this.desc = desc;
        this.image = image;
    }
}
package com.example.villageos;

public class ComplaintModel {
    String type,desc;

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

    public ComplaintModel() {
    }

    public ComplaintModel(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}

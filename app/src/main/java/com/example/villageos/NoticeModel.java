package com.example.villageos;

public class NoticeModel {
    String title, desc, date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NoticeModel() {
    }

    public NoticeModel(String title, String desc, String date) {
        this.title = title;
        this.desc = desc;
        this.date = date;
    }
}

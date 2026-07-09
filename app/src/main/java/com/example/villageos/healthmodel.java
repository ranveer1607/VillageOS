package com.example.villageos;


public class healthmodel {


    String campName;
    String date;
    String location;
    String description;



    public healthmodel()
    {

    }



    public healthmodel(String campName, String date,
                           String location, String description)
    {
        this.campName = campName;
        this.date = date;
        this.location = location;
        this.description = description;
    }



    public String getCampName() {
        return campName;
    }


    public String getDate() {
        return date;
    }


    public String getLocation() {
        return location;
    }


    public String getDescription() {
        return description;
    }

}
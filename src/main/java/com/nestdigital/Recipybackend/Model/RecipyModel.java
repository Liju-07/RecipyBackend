package com.nestdigital.Recipybackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "foods")
@Entity

public class RecipyModel {
    @Id
    @GeneratedValue
    public int id;
    public String fname;
    public String type;
    public String make;
    public String quality;


    public RecipyModel(int id, String fname, String type, String make, String quality) {
        this.id = id;
        this.fname = fname;
        this.type = type;
        this.make = make;
        this.quality = quality;
    }

    public RecipyModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}

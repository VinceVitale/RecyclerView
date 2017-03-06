package com.example.vincevitale.recyclerviewwork;

public class DataModel {
    String name;
    String version;
    int id_;
    int image;

    public DataModel(String name, String version, int id_, int image){
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }

    public int getId(){
        return id_;
    }
    public int getImage(){
        return image;
    }
}

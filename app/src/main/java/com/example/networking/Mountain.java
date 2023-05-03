package com.example.networking;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Mountain {
    private String ID;
    private String name;
    private String company;
    private String location;
    private String category;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;
    Map<String,String> auxdata;

    public String getName() {
        return name;
    }
}

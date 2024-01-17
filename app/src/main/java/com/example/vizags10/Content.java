package com.example.vizags10;

public class Content {
    private String mName;
    private int mImageResourceId;

    public Content (String Name , int ImageResourceId){
        mName = Name;
        mImageResourceId = ImageResourceId;
    }

    public String getName(){
        return mName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}

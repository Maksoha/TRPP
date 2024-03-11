package com.mirea.trpp.data.models;


public class PhotoModel {

    private int imageResourceId;

    public PhotoModel(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}

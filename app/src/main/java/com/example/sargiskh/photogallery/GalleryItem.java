package com.example.sargiskh.photogallery;

/**
 * Created by sargiskh on 12/1/2016.
 */

public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;



    @Override
    public String toString() {
        return mCaption;
    }

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
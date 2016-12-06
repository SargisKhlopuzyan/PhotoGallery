package com.example.sargiskh.photogallery;

import android.net.Uri;

/**
 * Created by sargiskh on 12/1/2016.
 */

public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;


    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getOwner() {
        return mOwner;
    }
    public void setOwner(String owner) {
        mOwner = owner;
    }
    public Uri getPhotoPageUri() {
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }
}

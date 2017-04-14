package com.bignerdranch.android.photogallery;

public class GalleryItem {
    private String caption;
    private String id;
    private String url;

    @Override
    public String toString() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String id() {
        return this.id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}

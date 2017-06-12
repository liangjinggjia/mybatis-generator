package com.zhou.hai.domain;

public class Photocollection {
    private Long photocollectionId;

    private String title;

    public Long getPhotocollectionId() {
        return photocollectionId;
    }

    public void setPhotocollectionId(Long photocollectionId) {
        this.photocollectionId = photocollectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}
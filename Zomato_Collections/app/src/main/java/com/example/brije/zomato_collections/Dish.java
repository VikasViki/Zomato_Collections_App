package com.example.brije.zomato_collections;

public class Dish {
    private String title, thumbnailUrl;
    private String description;

    public Dish() {
    }

    public Dish(String name, String thumbnailUrl, String description) {
        this.title = name;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

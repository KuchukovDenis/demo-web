package com.example.demoweb.com.example.demoweb.model;

import java.util.Date;

public class Post {
    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Post(String text) {
        this.text = text;
        creationDate = new Date();
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    private Date creationDate;
    private String text;
    private Integer likes;
}

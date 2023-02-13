package com.example.demoweb.com.example.demoweb.model;

public class Post {
    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Post(String text) {
        this.text = text;
    }

    private String text;
    private Integer likes;
}

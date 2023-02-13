package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("post1"));
        posts.add(new Post("post2"));
        posts.add(new Post("post3"));
        return posts;

    }
}
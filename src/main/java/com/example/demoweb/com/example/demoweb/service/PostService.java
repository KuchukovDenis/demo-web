package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<>();
    public ArrayList<Post> listAllPosts(){
        // posts.add(new Post("post1" ));
       // posts.add(new Post("post2"));
       // posts.add(new Post("post3"));
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}

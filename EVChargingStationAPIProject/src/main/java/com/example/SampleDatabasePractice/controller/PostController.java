package com.example.SampleDatabasePractice.controller;

import com.example.SampleDatabasePractice.model.Post;
import com.example.SampleDatabasePractice.service.PostService;
import com.example.SampleDatabasePractice.utils.StringToPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("master")

public class PostController {
    @Autowired
    PostService postService;


    @PostMapping("savePost")
    public ResponseEntity<String> save(@RequestBody String post){
        Post postobj = StringToPost.Convert(post);
        postService.setPost(postobj);
        return new ResponseEntity<>("Post saved", HttpStatus.CREATED);
    }

}

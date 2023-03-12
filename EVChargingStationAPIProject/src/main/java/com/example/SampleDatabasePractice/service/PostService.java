package com.example.SampleDatabasePractice.service;

import com.example.SampleDatabasePractice.dao.PostRepository;
import com.example.SampleDatabasePractice.exception.RecordNotFound;
import com.example.SampleDatabasePractice.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public Post getById(Integer id){
        return postRepository.findById(id).orElseThrow(()->new RecordNotFound("Record not found"));
    }
    public void setPost(Post post){
        postRepository.save(post);
    }
}

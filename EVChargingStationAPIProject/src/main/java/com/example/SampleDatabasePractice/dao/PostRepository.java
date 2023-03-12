package com.example.SampleDatabasePractice.dao;

import com.example.SampleDatabasePractice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}

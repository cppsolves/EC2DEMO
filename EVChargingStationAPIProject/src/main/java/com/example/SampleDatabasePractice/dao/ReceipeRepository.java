package com.example.SampleDatabasePractice.dao;

import com.example.SampleDatabasePractice.model.Receipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceipeRepository extends JpaRepository<Receipe,Integer> {
}

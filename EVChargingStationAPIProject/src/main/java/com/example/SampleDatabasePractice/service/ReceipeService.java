package com.example.SampleDatabasePractice.service;

import com.example.SampleDatabasePractice.dao.ReceipeRepository;
import com.example.SampleDatabasePractice.dto.Message;
import com.example.SampleDatabasePractice.exception.RecordNotFound;
import com.example.SampleDatabasePractice.model.Receipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceipeService {
    @Autowired
    ReceipeRepository receipeRepository;
    public List<Receipe> getAllReceipe(){
       return receipeRepository.findAll();
    }
    public Message saveReceipe(Receipe receipe){
        receipeRepository.save(receipe);
        return new Message("Receipe uploaded");
    }
    public Receipe getReceipeId(Integer id){
        return receipeRepository.findById(id).orElseThrow(()->new RecordNotFound("Record with "+id+" not present"));
    }
    public Receipe updateReceipe(Integer id,String ingredient){
        Receipe receipe = receipeRepository.findById(id).orElseThrow(()->new RecordNotFound("Record with "+id+" not present"));
        receipe.setIngredients(ingredient);
        return receipeRepository.save(receipe);
    }
    public void deleteReceipe(Integer id){
        Receipe receipe = receipeRepository.findById(id).orElseThrow(()->new RecordNotFound("Record with "+id+" not present"));
        receipeRepository.deleteById(id);
    }
}

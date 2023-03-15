package com.example.SampleDatabasePractice.controller;

import com.example.SampleDatabasePractice.dao.ReceipeRepository;
import com.example.SampleDatabasePractice.dto.Message;
import com.example.SampleDatabasePractice.model.Receipe;
import com.example.SampleDatabasePractice.service.ReceipeService;
import com.example.SampleDatabasePractice.utils.StringToReceipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("master")
public class ReceipeController {
    @Autowired
    ReceipeService receipeService;
    @GetMapping("getAllReceipe")
    public List<Receipe> getall(){
      return receipeService.getAllReceipe();
    }
    @PostMapping("saveReceipe")
    public ResponseEntity<Message> saveReceipe(@RequestParam String Receipe){
        Receipe receipe = StringToReceipe.Convert(Receipe);
        receipeService.saveReceipe(receipe);
        return new ResponseEntity<>(new Message("Receipe saved"), HttpStatus.CREATED);
    }
    @GetMapping("getReceipeById")
    public Receipe getById(@RequestParam Integer id){
        return receipeService.getReceipeId(id);
    }
    @PutMapping("updateReceipe")
    public Receipe update(@RequestParam Integer id,@RequestParam String ingredients){
        return receipeService.updateReceipe(id,ingredients);
    }
    @DeleteMapping("deleteReceipe")
    public ResponseEntity<Message> delete(@RequestParam Integer id){
        receipeService.deleteReceipe(id);
        return new ResponseEntity<>(new Message("Receipe deleted successfully"),HttpStatus.NO_CONTENT);
    }
}

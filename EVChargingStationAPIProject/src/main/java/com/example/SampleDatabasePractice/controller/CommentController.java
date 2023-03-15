package com.example.SampleDatabasePractice.controller;

import com.example.SampleDatabasePractice.dto.Message;
import com.example.SampleDatabasePractice.model.Comment;
import com.example.SampleDatabasePractice.service.CommentService;
import com.example.SampleDatabasePractice.service.ReceipeService;
import com.example.SampleDatabasePractice.utils.StringToComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("master")
public class CommentController {
    @Autowired
    CommentService commentService;
    @GetMapping("getAll")
    public List<Comment> getAll(){
       return commentService.getAllComment();
    }
    @PostMapping("saveComment")
    public ResponseEntity<Message> saveComment(@RequestParam String Comment){
        Comment comment = StringToComment.Convert(Comment);
        Message message = commentService.saveComment(comment);
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }
}

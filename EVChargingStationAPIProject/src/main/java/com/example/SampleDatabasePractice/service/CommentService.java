package com.example.SampleDatabasePractice.service;
import com.example.SampleDatabasePractice.dao.CommentRepository;
import com.example.SampleDatabasePractice.dao.ReceipeRepository;
import com.example.SampleDatabasePractice.dto.Message;
import com.example.SampleDatabasePractice.exception.RecordNotFound;
import com.example.SampleDatabasePractice.model.Comment;
import com.example.SampleDatabasePractice.model.Receipe;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {
    private static int commentId;
    static {
        commentId=1;
    }
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    ReceipeRepository receipeRepository;
    public List<Comment> getAllComment(){
       return commentRepository.findAll();
    }
    public Message saveComment(Comment comment){
        commentRepository.save(comment);
        Comment comment1 = commentRepository.findById(commentId++).orElseThrow(()->new RecordNotFound("Record with id "+commentId+" not present"));
        Integer id = comment1.getCommentId();
        Receipe receipe = receipeRepository.findById(id).orElseThrow(()->new RecordNotFound("Record with "+id+" not present"));
        receipe.setComment(comment);
        comment1.setReceipe(receipe);
        receipeRepository.save(receipe);
        commentRepository.save(comment1);
        return new Message("Comment saved with id "+id+" and mapped to its recipe successfully");
    }
    public void deleteComment(Integer id){
        commentRepository.deleteById(id);
    }
}

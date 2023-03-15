package com.example.SampleDatabasePractice.utils;

import com.example.SampleDatabasePractice.model.Comment;
import org.json.JSONObject;

public class StringToComment {
    public static Comment Convert(String Comment){
        JSONObject jsonObject = new JSONObject(Comment);
        Comment comment = new Comment();
        comment.setComment(jsonObject.getString("comment"));
        return comment;
    }
}

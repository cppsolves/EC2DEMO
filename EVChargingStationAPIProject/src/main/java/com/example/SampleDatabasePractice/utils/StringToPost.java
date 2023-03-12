package com.example.SampleDatabasePractice.utils;

import com.example.SampleDatabasePractice.model.Post;
import org.json.JSONObject;

public class StringToPost {
    public static Post Convert(String post){
        JSONObject jsonObject = new JSONObject(post);
        Post postObj = new Post();
        postObj.setTitle(jsonObject.getString("title"));
        postObj.setDescription(jsonObject.getString("description"));
        return postObj;
    }
}

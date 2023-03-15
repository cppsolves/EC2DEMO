package com.example.SampleDatabasePractice.utils;

import com.example.SampleDatabasePractice.model.Receipe;
import org.json.JSONObject;

public class StringToReceipe {
    public static Receipe Convert(String Receipe){
        JSONObject jsonObject = new JSONObject(Receipe);
        Receipe receipe = new Receipe();
        receipe.setName(jsonObject.getString("name"));
        receipe.setIngredients(jsonObject.getString("ingredients"));
        receipe.setInstructions(jsonObject.getString("instructions"));
        return receipe;
    }
}

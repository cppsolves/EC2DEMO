package com.example.SampleDatabasePractice.exception;

public class RecordNotFound extends RuntimeException{
    public RecordNotFound(){
        super();
    }
    public RecordNotFound(String message){
        super(message);
    }
}

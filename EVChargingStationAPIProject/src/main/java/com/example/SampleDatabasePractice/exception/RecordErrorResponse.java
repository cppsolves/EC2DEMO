package com.example.SampleDatabasePractice.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecordErrorResponse {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private ZonedDateTime zonedDateTime;
    private int statusCode;
    private String path;
    private String message;
}

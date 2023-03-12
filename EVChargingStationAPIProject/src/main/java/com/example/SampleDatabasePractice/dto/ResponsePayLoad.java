package com.example.SampleDatabasePractice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponsePayLoad {
    private Integer stationId;
    private String stationName;
    private Double stationPricing;
    private String stationAddress;
    private byte[] imageData;
}

package com.example.genreservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private String message;
    private int statusCode;
}

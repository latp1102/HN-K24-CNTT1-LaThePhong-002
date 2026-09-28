package com.example.genreservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private String error;
    private int statusCode;
}

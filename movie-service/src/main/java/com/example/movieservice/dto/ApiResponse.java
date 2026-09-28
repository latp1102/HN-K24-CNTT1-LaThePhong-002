package com.example.movieservice.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private Object errors;
    private HttpStatus status;
}

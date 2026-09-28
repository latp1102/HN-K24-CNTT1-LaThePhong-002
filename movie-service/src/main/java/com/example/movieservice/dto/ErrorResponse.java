package com.example.movieservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {
    private String message;
    private String code;
    private String timestamp;
}

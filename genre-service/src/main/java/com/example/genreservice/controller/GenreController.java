package com.example.genreservice.controller;

import com.example.genreservice.dto.ApiResponse;
import com.example.genreservice.entity.Genre;
import com.example.genreservice.service.GenreService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/genres")
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("/{genreId}")
    public ResponseEntity<ApiResponse<Genre>> getGenreById(@PathVariable Long genreId) {
        return new ResponseEntity<>(new ApiResponse<Genre>(
                true,
                "Lấy thông tin thể loại thành công",
                genreService.findById(genreId),
                null,
                HttpStatus.OK.value()
        ), HttpStatus.OK);
    }
}

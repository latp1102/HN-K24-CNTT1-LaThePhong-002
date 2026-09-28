package com.example.movieservice.openfeign;

import com.example.movieservice.dto.ApiResponse;
import com.example.movieservice.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieServices {
    @GetMapping("/api/v1/movies")
    public List<ApiResponse<Movie>> getAllMovies(@PathVariable Long genreId);
}

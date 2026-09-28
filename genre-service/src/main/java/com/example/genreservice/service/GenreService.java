package com.example.genreservice.service;

import com.example.genreservice.entity.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> findAll();
    Genre findById(Long genreId);
    Genre insert(Genre genre);
    void deleteById(Long genreId);
    Genre update(Long genreId, Genre genre);
}

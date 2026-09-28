package com.example.genreservice.repository;

import com.example.genreservice.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreReposotory extends JpaRepository<Genre, Long> {
}

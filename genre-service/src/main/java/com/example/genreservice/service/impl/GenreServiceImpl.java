package com.example.genreservice.service.impl;

import com.example.genreservice.entity.Genre;
import com.example.genreservice.repository.GenreReposotory;
import com.example.genreservice.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreReposotory genreRepository;

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public Genre findById(Long genreId) {
        return genreRepository.findById(genreId).orElseThrow(() -> new NoSuchElementException("Không tồn tại thể loại có mã: " + genreId));
    }

    @Override
    public Genre insert(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void deleteById(Long genreId) {
        genreRepository.deleteById(genreId);
    }

    @Override
    public Genre update(Long genreId, Genre genre) {
        Genre existingGenre = findById(genreId);
        existingGenre.setName(genre.getName());
        existingGenre.setDescription(genre.getDescription());
        return genreRepository.save(existingGenre);
    }
}

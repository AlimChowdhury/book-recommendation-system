package com.example.BookRecommendationSystem.service;

import com.example.BookRecommendationSystem.model.BookRecommendation;
import com.example.BookRecommendationSystem.repository.BookRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRecommendationService {
    private final BookRecommendationRepository bookRecommendationRepository;

    @Autowired
    public BookRecommendationService(BookRecommendationRepository bookRecommendationRepository) {
        this.bookRecommendationRepository = bookRecommendationRepository;
    }

    public BookRecommendation addBookRecommendation(BookRecommendation bookRecommendation) {
        return bookRecommendationRepository.save(bookRecommendation);
    }

    public List<BookRecommendation> getAllBookRecommendations() {
        return bookRecommendationRepository.findAll();
    }
}

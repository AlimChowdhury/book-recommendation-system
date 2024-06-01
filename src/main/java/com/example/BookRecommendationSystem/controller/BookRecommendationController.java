package com.example.BookRecommendationSystem.controller;


import com.example.BookRecommendationSystem.model.BookRecommendation;
import com.example.BookRecommendationSystem.service.BookRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class BookRecommendationController {

    private final BookRecommendationService bookRecommendationService;

    @Autowired
    public BookRecommendationController(BookRecommendationService bookRecommendationService) {
        this.bookRecommendationService = bookRecommendationService;
    }

    @PostMapping("/add")
    public ResponseEntity<BookRecommendation> addBookRecommendation(@RequestBody BookRecommendation bookRecommendation) {
        return ResponseEntity.ok(bookRecommendationService.addBookRecommendation(bookRecommendation));
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookRecommendation>> getAllBookRecommendations() {
        return ResponseEntity.ok(bookRecommendationService.getAllBookRecommendations());
    }
}

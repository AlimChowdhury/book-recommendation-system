package com.example.BookRecommendationSystem.controller;

import com.example.BookRecommendationSystem.service.GoogleBooksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final GoogleBooksService googleBooksService;

    public BookController(GoogleBooksService googleBooksService) {
        this.googleBooksService = googleBooksService;
    }

    @GetMapping("/search")
    public String searchBooks(@RequestParam String query) {
        return googleBooksService.searchBooks(query);
    }
}
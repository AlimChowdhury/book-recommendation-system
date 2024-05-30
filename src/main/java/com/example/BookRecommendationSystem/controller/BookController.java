package com.example.BookRecommendationSystem.controller;

import com.example.BookRecommendationSystem.service.GoogleBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private GoogleBooksService googleBooksService;

    @GetMapping("/search")
    public String searchBooks(@RequestParam String query) {
        return googleBooksService.searchBooks(query);
    }
}
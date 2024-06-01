package com.example.BookRecommendationSystem.repository;

import com.example.BookRecommendationSystem.model.BookRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRecommendationRepository extends JpaRepository<BookRecommendation, Long> {
}
package com.cyberlib.mybook.dao;

import com.cyberlib.mybook.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

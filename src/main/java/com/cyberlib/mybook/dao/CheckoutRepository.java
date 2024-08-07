package com.cyberlib.mybook.dao;


import com.cyberlib.mybook.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);
}


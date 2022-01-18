package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long>{
    List<Account> findByPublished(boolean published);

    List<Account> findByTitleContaining(String title);
}
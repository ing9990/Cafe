package com.example.coffeeshop.repository;

import com.example.coffeeshop.domain.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe,Long> {

}

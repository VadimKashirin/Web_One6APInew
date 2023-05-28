package com.example.web_one6apinew.repository;

import com.example.web_one6apinew.model.Produckt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReppository extends JpaRepository<Produckt,Integer> {
}

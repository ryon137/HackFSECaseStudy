package com.example.HackFSE.repository;

import com.example.HackFSE.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, String> {
}

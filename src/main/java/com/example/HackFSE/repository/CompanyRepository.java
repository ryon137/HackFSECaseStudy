package com.example.HackFSE.repository;

import com.example.HackFSE.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}

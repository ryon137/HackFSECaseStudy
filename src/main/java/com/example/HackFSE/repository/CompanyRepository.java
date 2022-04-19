package com.example.HackFSE.repository;

import com.example.HackFSE.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CompanyRepository extends MongoRepository<Company, String> {
    void delete(Optional<Company> company);
}

package com.example.HackFSE.service;

import com.example.HackFSE.model.Company;
import com.example.HackFSE.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }



    public Company createCompany(Company company){
        return companyRepository.save(company);
    }


}

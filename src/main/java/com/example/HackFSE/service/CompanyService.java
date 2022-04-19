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

    public List<Company> getCompanies(){
        return companyRepository.findAll();
    }

    public Optional<Company> getCompany(UUID companyCode){
        return companyRepository.findById(String.valueOf(companyCode));
    }

    public Company createCompany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(UUID companyCode){
        Optional<Company> company = companyRepository.findById(companyCode.toString());
        companyRepository.delete(company);
        System.out.println("Company " + company + " deleted");
    }
}

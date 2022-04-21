package com.example.HackFSE.controller;

import com.example.HackFSE.model.Company;
import com.example.HackFSE.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1.0/market/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @PostMapping("/register")
    public ResponseEntity<Company> createCompany(@RequestBody Company company){
        return new ResponseEntity(companyService.createCompany(company), HttpStatus.CREATED);
    }

}

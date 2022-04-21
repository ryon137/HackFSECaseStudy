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

    @GetMapping("/info/{companyCode}")
    public ResponseEntity<Company> getCompany(@PathVariable UUID companyCode){
        return new ResponseEntity(companyService.getCompany(companyCode), HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<Set<Company>> getCompanies(){
        return new ResponseEntity(companyService.getCompanies(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{companyCode}")
    public ResponseEntity<Company> deleteCompany(@PathVariable UUID companyCode){
        return new ResponseEntity(companyService.deleteCompany(companyCode), HttpStatus.OK);
    }
}

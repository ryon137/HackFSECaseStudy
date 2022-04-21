package com.example.HackFSE.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

public class Company {

    @Id
    private UUID companyCode;
    private String companyName;
    private String companyCEO;
    private Double companyTurnover;
    private String companyWebsite;
    private String listedStockExchange;

    public Company(UUID companyCode, String companyName, String companyCEO, Double companyTurnover, String companyWebsite, String listedStockExchange){
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyCEO = companyCEO;
        this.companyTurnover = companyTurnover;
        this.companyWebsite = companyWebsite;
        this.listedStockExchange = listedStockExchange;
    }

    public UUID getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(UUID companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    public Double getCompanyTurnover() {
        return companyTurnover;
    }

    public void setCompanyTurnover(Double companyTurnover) {
        this.companyTurnover = companyTurnover;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getListedStockExchange() {
        return listedStockExchange;
    }

    public void setListedStockExchange(String listedStockExchange) {
        this.listedStockExchange = listedStockExchange;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyCode=" + companyCode +
                ", companyName='" + companyName + '\'' +
                ", companyCEO='" + companyCEO + '\'' +
                ", companyTurnover=" + companyTurnover +
                ", companyWebsite='" + companyWebsite + '\'' +
                ", listedStockExchange='" + listedStockExchange + '\'' +
                '}';
    }
}

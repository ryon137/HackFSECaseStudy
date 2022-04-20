package com.example.HackFSE.controller;

import com.example.HackFSE.model.Stock;
import com.example.HackFSE.service.CompanyService;
import com.example.HackFSE.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1.0/market/stock")
public class StockController {
    private StockService stockService;

    private CompanyService companyService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/add/{companyCode}")
    public ResponseEntity<Stock> createStock(@PathVariable UUID companyCode, @RequestBody Stock stock){
        //need to add so that it associates it with company
        stock.setRelatedCompany(companyService.getCompany(companyCode));
        return new ResponseEntity(stockService.addStock(stock), HttpStatus.OK);
    }


}

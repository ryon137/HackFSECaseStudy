package com.example.HackFSE.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

public class Stock {
    @Id
    private UUID stockId;
    private double price;
    private Date date;
    private Date date_time;
    private Company relatedCompany;

    public Stock(UUID id, double price, Date date, Date date_time, Company relatedCompany) {
        this.stockId = id;
        this.price = price;
        this.date = date;
        this.date_time = date_time;
        this.relatedCompany = relatedCompany;
    }

    public UUID getStockId() {
        return stockId;
    }

    public double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public Date getDate_time() {
        return date_time;
    }

    public Company getRelatedCompany() {
        return relatedCompany;
    }

    public void setStockId(UUID stockId) {
        this.stockId = stockId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public void setRelatedCompany(Company relatedCompany) {
        this.relatedCompany = relatedCompany;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", price=" + price +
                ", date=" + date +
                ", date_time=" + date_time +
                ", relatedCompany=" + relatedCompany +
                '}';
    }
}

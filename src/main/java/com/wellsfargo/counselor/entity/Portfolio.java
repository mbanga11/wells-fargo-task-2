package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;  // Foreign key to Client

    @Column(nullable = false)
    private String portfolioType;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate dateCreated;

    protected Portfolio() {}

    public Portfolio(Client client, String portfolioType, String portfolioName, LocalDate dateCreated) {
        this.client = client;
        this.portfolioType = portfolioType;
        this.portfolioName = portfolioName;
        this.dateCreated = dateCreated;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}

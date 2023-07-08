package org.prueba.dioni.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    private String model;

    private LocalDate date;

    private double weight;

    private int doorNumber;

    private int cv;

//setters and getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }


    public Car cv(int cv) {
        this.cv = cv;
        return this;
    }

    public Car doorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
        return this;
    }

    public Car weight(double weight) {
        this.weight = weight;
        return this;
    }

    public Car date(LocalDate date) {
        this.date = date;
        return this;
    }

    public Car model(String model) {
        this.model = model;
        return this;
    }

    public Car brand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public Car id(Long id) {
        this.id = id;
        return this;
    }
}

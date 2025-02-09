package com.hybrid.rooms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rm__rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "CHAR")
    private char category;
    private boolean isOpen;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;

    public Room() {
    }

    public Room(String name, char category, boolean isOpen, Sector sector) {
        this.name = name;
        this.category = category;
        this.isOpen = isOpen;
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getCategory() {
        return category;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public Sector getSector() {
        return sector;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}

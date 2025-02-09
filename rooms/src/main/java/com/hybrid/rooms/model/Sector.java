package com.hybrid.rooms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int permissionLevel;

    public Sector() {
    }

    public Sector(String name, int permissionLevel) {
        this.name = name;
        this.permissionLevel = permissionLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }    
}

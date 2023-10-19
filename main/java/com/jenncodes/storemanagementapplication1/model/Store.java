package com.jenncodes.storemanagementapplication1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastName;
    private String firstName;
    private boolean admin;
    private boolean storeManager;
    private boolean storeStaff;


    public Store() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isStoreManager() {
        return storeManager;
    }

    public void setStoreManager(boolean storeManager) {
        this.storeManager = storeManager;
    }

    public boolean isStoreStaff() {
        return storeStaff;
    }

    public void setStoreStaff(boolean storeStaff) {
        this.storeStaff = storeStaff;
    }
}

package com.services.Services.model;

import com.services.Services.model.enums.UserType;
import jakarta.persistence.Entity;

@Entity
public class Admin extends Users{

    public Admin(){}

    public Admin(Long id, String name, String email, String password, UserType type) {
        super(id, name, email, password, type);
    }
}

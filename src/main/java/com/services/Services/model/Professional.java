package com.services.Services.model;

import com.services.Services.model.enums.UserType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Professional extends Users {

    private String specialty;
    private String phone;
    @OneToMany(mappedBy = "professional", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments = new ArrayList<>();
    @OneToMany(mappedBy = "professional", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Time> agenda;

    public Professional(){}

    public Professional(Long id, String name, String email, String password, UserType type, String specialty, String phone, List<Time> agenda) {
        super(id, name, email, password, type);
        this.specialty = specialty;
        this.phone = phone;
        this.agenda = agenda;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Time> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Time> agenda) {
        this.agenda = agenda;
    }
}

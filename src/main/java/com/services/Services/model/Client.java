package com.services.Services.model;

import com.services.Services.model.enums.UserType;

import java.util.List;

public class Client extends Users {

    private String phone;
    private List<Appointment> appointments;

    public Client(){}

    public Client(Long id, String name, String email, String password, UserType type, String phone, List<Appointment> appointments) {
        super(id, name, email, password, type);
        this.phone = phone;
        this.appointments = appointments;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}

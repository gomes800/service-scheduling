package com.services.Services.model;

import com.services.Services.model.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id, nullable = false")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "professional_id, nullable = false")
    private Professional professional;
    @ManyToOne
    @JoinColumn(name = "service_id, nullable = false")
    private Service service;
    private LocalDateTime dateTime;
    private Status status;

    public Appointment(){}

    public Appointment(Long id, Client client, Professional professional, Service service, LocalDateTime dateTime, Status status) {
        this.id = id;
        this.client = client;
        this.professional = professional;
        this.service = service;
        this.dateTime = dateTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

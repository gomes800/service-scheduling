package com.services.Services.model;

import java.time.LocalDateTime;

public class Time {

    private Long id;
    private Professional professional;
    private LocalDateTime dateTime;
    private boolean available;

    public Time(){}

    public Time(Long id, Professional professional, LocalDateTime dateTime, boolean available) {
        this.id = id;
        this.professional = professional;
        this.dateTime = dateTime;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

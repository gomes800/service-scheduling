package com.services.Services.model.enums;

public enum UserType {
    PROFISSIONAL(0),
    CLIENTE(1),
    ADMIN(2);

    private final int valor;

    UserType(int valor) {this.valor = valor;}

    public int getValor() {return valor;}
}

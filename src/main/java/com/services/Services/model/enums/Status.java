package com.services.Services.model.enums;

public enum Status {
    CONFIRMED(0),
    PENDING(1),
    CANCELED(2);

    private final int valor;

    Status(int valor) {this.valor = valor;}

    public int getValor() {return valor;}
}

package com.tarea1doo;

import java.util.ArrayList;
import java.util.List;

public class DepositoMonedas {
    private List<Moneda> monedas;

    public DepositoMonedas() {
        this.monedas = new ArrayList<>();
    }

    public void agregarMoneda(Moneda moneda) {
        this.monedas.add(moneda);
    }

    public List<Moneda> getMonedas() {
        return this.monedas;
    }
}

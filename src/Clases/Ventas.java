/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author raulh
 */
public class Ventas {
    public String nombre;
    public double cantidad;
    public double total;

    public Ventas() {
    }

    public Ventas(String nombre, double cantidad, double total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total = total;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author raulh
 */
public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public String proveedor;
    
    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad, String proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }  
}

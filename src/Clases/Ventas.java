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
    public String Vendedor;
    public String total;
    public String producto;

    public Ventas(String nombre, double cantidad, String Vendedor, String total, String producto) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.Vendedor = Vendedor;
        this.total = total;
        this.producto = producto;
    }
    
    
    public Ventas() {
    }

}

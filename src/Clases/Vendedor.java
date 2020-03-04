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
public class Vendedor {
    public String código;
    public String nombre;
    public String dirección;
    public String contacto;

    public Vendedor() {
    }
    
    public Vendedor(String código, String nombre, String dirección, String contacto) {
        this.código = código;
        this.nombre = nombre;
        this.dirección = dirección;
        this.contacto = contacto;
    }   
}

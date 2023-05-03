/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.entidades;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author SFC
 */
public class Tienda {

    public HashMap<String, Double> productos;
    public String nombre;
    public Double precio;

    public Tienda() {
    }

    public Tienda(HashMap<String, Double> productos, String nombre, Double precio) {
        this.productos = productos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.productos);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + productos + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}

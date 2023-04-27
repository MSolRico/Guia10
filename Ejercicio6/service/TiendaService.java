/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.service;

import Ejercicio6.entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> producto;
    
    public Tienda crearTienda() {
        Tienda tienda = new Tienda();
        agregarProductos(tienda);
        return tienda;
    }

    public void agregarProductos(Tienda tienda) {
        String resp = "S";
        do {
            System.out.println("Ingrese nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer.nextDouble();
            tienda.getProductos().put(nombre, precio);
            System.out.println("Desea agregar otro producto S o N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));
        
    }
    
    public void mostrar(Tienda tienda) {
        for (Map.Entry<String, Double> t1 : tienda.getProductos().entrySet()) {
            System.out.println(t1.getKey() + "=" + t1.getValue());            
        }
    }
    
    public void eliminarProducto(Tienda tienda,String producto){
      
       for (Map.Entry<String, Double> t1 : tienda.getProductos().entrySet()) {
            if(t1.getKey().equalsIgnoreCase(producto)){
                tienda.getProductos().remove(producto);
                break;
            }           
        } 
    }
    public void modificarPrecio(){
        
    }

}

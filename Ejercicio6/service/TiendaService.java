/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6.service;

import Ejercicio6.entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class TiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public HashMap<String, Double> productos = new HashMap();

    public void agregarProductos() {
        String resp;
        do {
            System.out.println("Ingrese nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro producto S o N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));
    }

    public void mostrar(Tienda tienda) {
        System.out.println("Lista de productos:");
        for (Map.Entry<String, Double> t1 : productos.entrySet()) {
            System.out.println(t1.getKey() + ": " + t1.getValue());
        }
    }

    public void eliminarProducto(Tienda tienda) {
        System.out.println("Ingrese el producto a eliminar");
        String producto = leer.next();
        for (Map.Entry<String, Double> t1 : productos.entrySet()) {
            if (t1.getKey().equalsIgnoreCase(producto)) {
                productos.remove(producto);
                break;
            }
        }
    }

    public void modificarPrecio(Tienda tienda) {
        System.out.println("Producto que quiere modificar:");
        String prod = leer.next();
        System.out.println("Precio nuevo:");
        for (Map.Entry<String, Double> t1 : productos.entrySet()) {
            if (t1.getKey().equalsIgnoreCase(prod)) {
                productos.replace(prod, leer.nextDouble());
                break;
            }
        }
    }

}

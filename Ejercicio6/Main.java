/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Ejercicio6.entidades.Tienda;
import Ejercicio6.service.TiendaService;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaService t1 = new TiendaService();
        Tienda tienda = t1.crearTienda();
        t1.mostrar(tienda);
        System.out.println("Ingrese el producto a eliminar");
     
        t1.eliminarProducto(tienda, leer.next());
        t1.mostrar(tienda);
    }
    
}

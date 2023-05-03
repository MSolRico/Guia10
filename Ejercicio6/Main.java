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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaService t1 = new TiendaService();
        Tienda tienda = new Tienda();
        int opc;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1)Desea agregar productos a su lista");
            System.out.println("2)Desea modificar un precio");
            System.out.println("3)Desea eliminar un producto");
            System.out.println("4)Desea ver la lista de productos");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    t1.agregarProductos();
                    break;
                case 2:
                    t1.modificarPrecio(tienda);
                    break;
                case 3:
                    t1.eliminarProducto(tienda);
                    break;
                case 4:
                    t1.mostrar(tienda);
                    break;
            }
        } while (opc <= 4);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4;

import EjercicioExtra4.servicio.CodigoPostalServicios;
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
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CodigoPostalServicios cps = new CodigoPostalServicios();
        int opc = 0;
        do {
            System.out.println("MENU \n1)Ingresar 10 códigos a la lista\n2)Agregar una ciudad a la lista \n3)Buscar un código postal\n4)Eliminar 3 codigos postales\n5)Ver la lista\n6)Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cps.map1();
                    break;
                case 2:
                    cps.agregar();
                    break;
                case 3:
                    cps.buscar();
                    break;
                case 4:
                    cps.eliminar();
                    break;
                case 5:
                    cps.mostrar();
                    break;
            }
        } while (opc < 6);
    }
}

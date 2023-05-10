/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.entidades.CantanteFamoso;
import EjercicioExtra2.service.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    static ArrayList<CantanteFamoso> ListaFamosos = new ArrayList();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        CantanteFamosoService cfs = new CantanteFamosoService();
        cfs.famosos();
        int opc = 0;
        boolean salir = true;
        do {
            System.out.println("Menu \n1-Agregar cantante \n2-Mostrar cantante \n3-Eliminar un cantante \n4-Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cfs.crearFamoso();
                    break;
                case 2:
                    cfs.mostrarCantante();
                    break;
                case 3:
                    cfs.Eliminar();
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }

        } while (salir);

    }

}

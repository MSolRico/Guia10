/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3;

import EjercicioExtra3.entidades.Libro;
import EjercicioExtra3.servicios.Libreria;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    public static void main(String[] args) {
        HashSet<Libro> Librero = new HashSet();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Libreria serv = new Libreria();
        String opc;
        int opci = 0;
        do {
            System.out.println("MENU \n1)Ingresar libros a la lista\n2)Llevarme un libro \n3)Devolver un libro\n4)Ver la lista de libros\n5)Salir");
            opci = read.nextInt();
            switch (opci) {
                case 1:
                    do {
                        serv.crearLibro();
                        System.out.println("Desea crear otro libro? S/N");
                        opc = read.next();
                    } while (opc.equalsIgnoreCase("S"));
                    break;
                case 2:
                    System.out.println(serv.prestamo());
                    break;
                case 3:
                    System.out.println(serv.devolucion());
                    break;
                case 4:
                    serv.mostrar();
                    break;
            }
        } while (opci < 5);
    }
}

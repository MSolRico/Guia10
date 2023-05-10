/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.service;

import EjercicioExtra2.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CantanteFamosoService {

    static ArrayList<CantanteFamoso> ListaFamosos = new ArrayList();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void famosos() {
        ListaFamosos.add(new CantanteFamoso("Carlos Gardel", "Mi Buenos Aires querido"));
        ListaFamosos.add(new CantanteFamoso("El Chaqueño Palavecino", "Disco 1"));
        ListaFamosos.add(new CantanteFamoso("El Indio Solaris", "Disco 2"));
        ListaFamosos.add(new CantanteFamoso("Alma Fuerte", "Niño Jefe"));
        ListaFamosos.add(new CantanteFamoso("Sumo", "Llegando los monos"));
    }

    public static void crearFamoso() {
        System.out.println("Ingrese el nombre del Cantante famoso");
        String nombre = leer.next();
        System.out.println("Ingrese el disco mas vendido");
        String disco = leer.next();
        ListaFamosos.add(new CantanteFamoso(nombre, disco));
    }

    public static void mostrarCantante() {
        System.out.println("Los cantantes famosos y sus discos mas vendidos son: ");
        for (CantanteFamoso aux : ListaFamosos) {
            System.out.println(aux);
        }
    }

    public static void Eliminar() {
        System.out.println("Ingrese el nombre del Cantante");
        String np = leer.next();
        for (CantanteFamoso cantante : ListaFamosos) {
            if (cantante.getNombre().equals(np)) {
                ListaFamosos.remove(cantante);
                System.out.println("Cantante Eliminado!");
                break;
            }
        }
    }
}

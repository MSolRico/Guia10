/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3.servicios;

import EjercicioExtra3.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Libreria {

    HashSet<Libro> Librero = new HashSet();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Libro> crearLibro() {
        System.out.println("Ingrese el título del libro");
        String nombre = read.next();
        System.out.println("Ingrese el autor");
        String autor = read.next();
        System.out.println("Ingrese el número de ejemplares disponibles");
        int nEjemplares = read.nextInt();
        System.out.println("Ingrese el número de ejemplares prestados");
        int nEPrestados = read.nextInt();
        Librero.add(new Libro(nombre, autor, nEjemplares, nEPrestados));
        return Librero;
    }

    public boolean prestamo() {
        System.out.println("Ingrese el título que esta buscando");
        String ejem = read.next();
        boolean ret = false;
        for (Libro libro : Librero) {
            if (libro.getTitulo().equals(ejem) && (libro.getnEjemplares() > libro.getnEPrestados())) {
                libro.setnEPrestados(libro.getnEPrestados() + 1);
                return true;
            }
        }
        return ret;
    }

    public boolean devolucion() {
        System.out.println("Ingrese el título del libro que quiere devolver");
        String ejemp = read.next();
        boolean retu = false;
        for (Libro libro : Librero) {
            if (libro.getTitulo().equals(ejemp) && (libro.getnEPrestados() > 1)) {
                libro.setnEPrestados(libro.getnEPrestados() - 1);
                return true;
            }
        }
        return retu;
    }

    public void mostrar() {
        System.out.println(Librero.toString());
    }
}

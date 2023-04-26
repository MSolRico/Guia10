package Ejercicio4.servicios;

import Ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPeliculas {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        String respuesta;
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese titulo de la pelicula: ");
            pelicula.setTitulo(scan.next());
            System.out.println("Ingrese director de la pelicula: ");
            pelicula.setDirector(scan.next());
            System.out.println("Ingrese duracion de la pelicula");
            pelicula.setDuracion(scan.nextDouble());
            peliculas.add(pelicula);
            do {
                System.out.println("Desea agregar otra pelicula? (si/no): ");
                respuesta = scan.next();
                if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                    System.out.println("La respuesta es incorrecta...");
                }
            } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

        } while (respuesta.equalsIgnoreCase("si"));
        return peliculas;

    }

}

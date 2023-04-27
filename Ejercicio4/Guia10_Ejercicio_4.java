package Ejercicio4;

import Ejercicio4.entidades.Pelicula;
import Ejercicio4.servicios.ServicioPeliculas;
import Ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

public class Guia10_Ejercicio_4 {

    public static void main(String[] args) {
        ServicioPeliculas sp = new ServicioPeliculas();
        ArrayList<Pelicula> peliculas = sp.crearPeliculas();

        System.out.println("");
        System.out.println("Peliculas:");
        peliculas.forEach((pelicula) -> System.out.println(pelicula.getTitulo()));

        System.out.println("");
        System.out.println("Peliculas mayores a 1 horas");

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }

        Collections.sort(peliculas, Comparadores.ordenarPorDuracion);

        System.out.println("");
        System.out.println("Ordenadas segun su duración de mayor a menor:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

        Collections.reverse(peliculas);

        System.out.println("");
        System.out.println("Ordenadas segun su duración de menor a mayor:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);

        System.out.println("");
        System.out.println("Ordenadas segun su título:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

        Collections.sort(peliculas, Comparadores.ordenarPorDirector);

        System.out.println("");
        System.out.println("Ordenadas segun su director:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

}

package Ejercicio4.utilidades;

import Ejercicio4.entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracion = (Pelicula t, Pelicula t1) -> t1.getDuracion().compareTo(t.getDuracion());

    public static Comparator<Pelicula> ordenarPorTitulo = (Pelicula t, Pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo());

    public static Comparator<Pelicula> ordenarPorDirector = (Pelicula t, Pelicula t1) -> t.getDirector().compareTo(t1.getDirector());

}

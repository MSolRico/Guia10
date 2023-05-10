package Ejercicio5.utilities;

import Ejercicio5.entidades.Paises;
import java.util.Comparator;

public class Comparador {
    public static Comparator<Paises> ordenarAlfabeticamente = (Paises t, Paises t1) -> t.getNombre().compareTo(t1.getNombre());
}

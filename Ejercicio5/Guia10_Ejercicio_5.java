package Ejercicio5;

import Ejercicio5.entidades.Paises;
import Ejercicio5.servicio.PaisesServicio;
import Ejercicio5.utilities.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Guia10_Ejercicio_5 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in).useDelimiter("\n");       
        PaisesServicio ps = new PaisesServicio();
        HashSet<Paises> paises = ps.crearPais();
//        HashSet<Paises> paises = new HashSet();
//        paises.add(new Paises("Argentina"));
//        paises.add(new Paises("Argentina"));
//        paises.add(new Paises("Brazil"));
//        paises.add(new Paises("Italia"));
//        paises.add(new Paises("Alemania"));
//        paises.add(new Paises("Uruguay"));
        ArrayList<Paises> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista, Comparador.ordenarAlfabeticamente);
        PaisesServicio.mostrarPaises(paisesLista);
        System.out.println("Ingrese un pais a borrar");
        paisesLista = PaisesServicio.borrarPais(paises, scan.next());
        Collections.sort(paisesLista, Comparador.ordenarAlfabeticamente);
        PaisesServicio.mostrarPaises(paisesLista);
       
    }

}

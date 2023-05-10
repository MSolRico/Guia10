package Ejercicio5.servicio;

import Ejercicio5.entidades.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Paises> paises = new HashSet();

    
    
    public HashSet crearPais() {
        String respuesta;
        do {
            System.out.println("Ingrese nombre del pais");
            paises.add(new Paises(scan.next()));
            do {
                System.out.println("Desea agregar otro país? (si/no): ");
                respuesta = scan.next();
                if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                    System.out.println("La respuesta es incorrecta...");
                }
            } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

        } while (respuesta.equalsIgnoreCase("si"));
//        mostrarPaises();
        return paises;
    }

    public static void mostrarPaises(ArrayList<Paises> paises){
        for (Paises pais : paises) {
            System.out.println(pais);
        }
    }
    
    public static ArrayList<Paises> borrarPais(HashSet paises, String pais){
        Iterator<Paises> iterador = paises.iterator();
        while (iterador.hasNext()) {            
            if (iterador.next().getNombre().equalsIgnoreCase(pais)) {
                iterador.remove();
                break;
                
            }else if (!iterador.hasNext()){
                System.out.println("El paises no se encuentra en la lista!! ");
//                return null;
            }
        }
        ArrayList<Paises> paises2 = new ArrayList(paises);
        
        return paises2;
    }
    
}

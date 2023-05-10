/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosService {

    private ArrayList<Integer> ListaNumeros = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLista() {
        int num = 0;
        do {
            System.out.println("Ingrese un numero. -99 para salir");
            num = leer.nextInt();
            if (num != (-99)) {
                ListaNumeros.add(num);
            }
        } while (num != (-99));
    }

    public void mostrarLista() {
        for (Integer aux : ListaNumeros) {
            System.out.println(aux);
        }
    }

    public void suma() {
        int suma = 0;
        double promedio = 0;
        for (Integer aux : ListaNumeros) {
            suma += aux;
        }
        promedio = suma / ListaNumeros.size();
        System.out.println("El valor de la suma es: " + suma);
        System.out.println("El valor del promedio es: " + promedio);
    }
}

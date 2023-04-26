/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    /**
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList <String> perros = new ArrayList();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("Ingrese una raza de perro");
            perros.add(read.next());
            System.out.println("Desea \n1)guardar otro perro\n2)salir");
            opcion = read.nextInt();
        } while (opcion<2);
        for (String perro : perros) {
            System.out.print(perro + ",");
        }
        Iterator <String> it = perros.iterator();
        System.out.println("");
        System.out.println("Ingrese una raza en la lista");
        String raza = read.next();
        int cont = 0;
        while(it.hasNext()){
            if (it.next().equals(raza)){
                it.remove();
                break;
            } else if (!it.hasNext()){
                System.out.println("");
                System.out.println("El perro no se encuentra en la lista");
            }
            cont++;
        }
        Collections.sort(perros);
        for (String perro : perros) {
            System.out.println(perro + ",");
        }
}
}

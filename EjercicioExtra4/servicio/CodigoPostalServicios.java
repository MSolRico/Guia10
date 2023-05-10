/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4.servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class CodigoPostalServicios {

    HashMap<Integer, String> codigo = new HashMap();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void map() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese una ciudad");
            String city = read.next();
            System.out.println("Ingrese el código postal");
            int cod = read.nextInt();
            codigo.put(cod, city);
        }
    }

    public void map1() {
        codigo.put(2344, "Arrufo");
        codigo.put(2340, "Ceres");
        codigo.put(2345, "Villa trinidad");
        codigo.put(3070, "San Cristobal");
        codigo.put(2344, "Arrufo");
        codigo.put(2349, "Suardi");
        codigo.put(2350, "La Rubia");
        codigo.put(3076, "La Verde");
        codigo.put(2352, "Hersilia");
        codigo.put(2341, "Colonia Montefiore");
        codigo.put(3060, "Tostado");
    }

    public void buscar() {
        System.out.println("Ingrese codigo postal");
        int bus = read.nextInt();
        if (codigo.containsKey(bus)) {
            System.out.println(codigo.get(bus));
        } else {
            System.out.println("No la tenemos en nuestra lista");
        }
    }

    public void mostrar() {
        for (Map.Entry<Integer, String> entry : codigo.entrySet()) {
            System.out.println("Ciudad: " + entry.getValue() + ", código postal: " + entry.getKey());
        }
    }

    public void agregar() {
        System.out.println("Ingrese una ciudad");
        String city = read.next();
        System.out.println("Ingrese el código postal");
        int cod = read.nextInt();
        codigo.put(cod, city);
    }

    public void eliminar() {
        int cont = 0;
        int key = 0;
        do {
            System.out.println("Ingrese ciudad a eliminar");
            String elim = read.next();
            for (Map.Entry<Integer, String> entry : codigo.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(elim)) {
                    key = entry.getKey();
                    cont++;
                }
            }
            if (key == 0) {
                System.out.println("No la tenemos en nuestra lista");
            }
            codigo.remove(key);
        } while (cont < 3);
    }
}

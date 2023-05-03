package Ejercicio3.Service;

import Ejercicio3.Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    public ArrayList<Alumno> CrearAlumno() {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        boolean opcion = true;

        do {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = imput.next();

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese las 3 notas correspondientes al alumno:");
            notas.add(imput.nextInt());
            notas.add(imput.nextInt());
            notas.add(imput.nextInt());

            listaAlumnos.add(new Alumno(nombre, notas));

            System.out.println("¿Desea ingresar los datos de otro alumno? S/N");
            String option = imput.next();
            if (option.equalsIgnoreCase("N")) {
                opcion = false;
            }

        } while (opcion);

        return listaAlumnos;
    }

    public double notaFinal(Alumno alumno) {

        double aux = 0;

        for (int i = 0; i < alumno.getNotas().size(); i++) {
            aux += alumno.getNotas().get(i);
        }
        return aux / alumno.getNotas().size();
    }
}

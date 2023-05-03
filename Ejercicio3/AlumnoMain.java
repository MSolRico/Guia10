package Ejercicio3;

import Ejercicio3.Entities.Alumno;
import Ejercicio3.Service.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");

        AlumnoService as = new AlumnoService();

        ArrayList<Alumno> alumnos = as.CrearAlumno();

        System.out.println("Ingrese el nombre del alumno a buscar:");
        String name = imput.next();

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(name)) {
                double promedio = as.notaFinal(alumno);
                System.out.println("El promedio del alumno es :" + promedio);
            }
        }

    }

}

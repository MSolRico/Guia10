/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3.entidades;

import java.util.Objects;

/**
 *
 * @author SFC
 */
public class Libro {

    private String titulo;
    private String autor;
    private int nEjemplares;
    private int nEPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nEjemplares, int nEPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEPrestados = nEPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEPrestados() {
        return nEPrestados;
    }

    public void setnEPrestados(int nEPrestados) {
        this.nEPrestados = nEPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.titulo);
        hash = 23 * hash + Objects.hashCode(this.autor);
        hash = 23 * hash + this.nEjemplares;
        hash = 23 * hash + this.nEPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.nEjemplares != other.nEjemplares) {
            return false;
        }
        if (this.nEPrestados != other.nEPrestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo = " + titulo + ", autor = " + autor + ", numero de ejemplares = " + nEjemplares + ", numero de ejemplares prestados = " + nEPrestados + '}';
    }

}

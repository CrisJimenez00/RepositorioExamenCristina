/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosutiles.metodosbusqueda;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author cristina
 */
public class Cancion implements Comparable<Cancion> {

    private String titulo;
    private String artista;
    private String album;
    private double duracion;
    private LocalDate fechaLanzamiento;

    public Cancion(String titulo, String artista, String album, double duracion, LocalDate fechaLanzamiento) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.artista);
        hash = 67 * hash + Objects.hashCode(this.album);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.fechaLanzamiento);
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
        final Cancion other = (Cancion) obj;

        //Ambos objetos son igulaes si tienen el mismo titulo
        //Si hay solo un atributo por el que se compare se usara Comparable
        //En caso de ser varios atributos en el equals se usaria la interfaz Comparator
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", album=" + album + ", duracion=" + duracion + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }

    //Metodo compareTo, devuelve un entero ya que el metodo compareTo devolvera
    //Un < 0 si el objeto comparado es menor al otro
    //Un 0 si son iguales
    //Un >0 si el objeto comparado es mayor al otro
    // = 0 si this y libro l son iguales
    // > 0 si this es posterior a l
    // < 0 si this es anterior a l
    @Override
    public int compareTo(Cancion c) {
        return this.titulo.compareTo(c.titulo);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosutiles.metodosbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author cristina
 */
public class ListaCancion {

    private ArrayList<Cancion> listaCanciones;

    //Constructor predeterminado (creará e inicializará la lista).
    public ListaCancion() {

        this.listaCanciones = new ArrayList<>();
    }

    //numeroCanciones(): devuelve el número de canciones de la lista. (El tamaño de la lista)
    public int numeroCanciones() {

        return listaCanciones.size();

    }

    //estaVacia(): devuelve si la lista de reproducción está vacía. 
    public boolean estaVacia() {

        //Devuelve un booleano con el metodo .isEmpty()
        return listaCanciones.isEmpty();

    }

    //escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
    //La posicion se pasa como parametro
    public Cancion escucharCancion(int posicion) {

        //Devuelve la posicion con el metodo .get()
        return listaCanciones.get(posicion);

    }

    //cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva 
    //Cancion proporcionada.
    //Se pasa la poscion y la cancion 
    public void cambiarCancion(int posicion, Cancion c) {
        //Con .add() en este caso no se añadiria si no que la cancion cambiaria eliminandose la otra
        listaCanciones.add(posicion, c);

    }

    //grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
    //Se le pasa una cancion para añadirla a la lista
    public void grabarCancion(Cancion c) {

        listaCanciones.add(c);
    }

    //eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
    //Se le pasa una posicion para eliminar dicha cancion con esa posicion de la lista
    public void eliminaCancion(int posicion) {

        listaCanciones.remove(posicion);

    }

    //eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de reproducción. 
    //Se le pasa la cancion para eliminarla de la lista
    public boolean eliminaCancion(Cancion c) {

        return listaCanciones.remove(c);
    }

    //Usando el método remove(Cancion)
    public boolean remove(Cancion cancion) {

        return listaCanciones.remove(cancion);

    }

    //imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres de las 
    //canciones contenidas en tmp.
    //Se le pasa una listaReproduccion creada en el main
    public static void imprimirLista(ListaCancion tmp) {

        //Se hace uso de una expresion lambda para imprimirlo, se obtiene el titulo de la cancion separado por comas
        //Se llamaria con tmp a la lista creada en la clase 
        tmp.listaCanciones.forEach(Cancion -> System.out.print(Cancion.getTitulo() + "/" + Cancion.getArtista() + " , "));
        //Se pondria un espacio para separacion
        System.out.println("");
    }

    //buscarCancion(Cancion c), busca la canción c en la lista de reproducción y devuelve la 
    //posición en la que se encuentra. Usa el método indexOf.
    //Se le pasa una cancion
    public int buscarCancion(Cancion c) {

        //Se ontiene el indice donde esta la cancion usando el metodo .indexOf()
        int indice = listaCanciones.indexOf(c);
        return indice;

    }

    //Ordenador por titulo, se necesita implementar comparable para que el metodo funcione
    //Collections.sort(lista) la lista debe contener objetos que implmeneten comparable
    public void ordenarPorTitulo() {

        Collections.sort(listaCanciones);

    }

    //Busqueda binaria por titulo, la lista debe estar ordenada para poder usar el metodo
    //Devuelve la posicion en la que se encuentra el objeto
    //La busqueda binaria de un objeto segun su orden natural
    //binarySearch no funciona si la lista esta desordenada
    public int buscarPorTitulo(Cancion c) {

        return Collections.binarySearch(listaCanciones, c);
    }

//Incluye un par de método de ordenación (por ejemplo, por título y por cantante) 
//usando el método Collections.sort(lista, criterioComparator)
    //Ordnenar con comparator, se hace un Collections.sort pasando la lista y dos objetos 
    //usando expresion lambda para comparar en este caso sus nombres
    public void ordenarComparatorArtista() {

        Collections.sort(listaCanciones, (Cancion c1, Cancion c2) -> c1.getArtista().compareTo(c2.getArtista()));
    }

    public void ordenarComparatorTitulo() {

        Collections.sort(listaCanciones, (Cancion c1, Cancion c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
    }

    public void ordenarTituloCantante() {

        Comparator<Cancion> criterioTitulo = (Cancion c1, Cancion c2) -> c1.getTitulo().compareTo(c2.getTitulo());
        Comparator<Cancion> criterioArtista = (Cancion c1, Cancion c2) -> c1.getArtista().compareTo(c2.getArtista());
        Comparator<Cancion> criterioTituloArtista = criterioTitulo.thenComparing(criterioArtista);

        Collections.sort(listaCanciones, criterioTituloArtista);
    }

//Añade también métodos para buscar, usando Collections.binarySearch(lista, objeto, 
//criterioComparator)
    public int buscarBinariaTitulo(Cancion c) {

        return Collections.binarySearch(listaCanciones, c, (Cancion c1, Cancion c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
    }

    public int buscarBinariaArtista(Cancion c) {

        return Collections.binarySearch(listaCanciones, c, (Cancion c1, Cancion c2) -> c1.getArtista().compareTo(c2.getArtista()));
    }

}

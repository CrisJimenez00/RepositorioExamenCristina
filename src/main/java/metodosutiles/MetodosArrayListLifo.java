/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosutiles;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class MetodosArrayListLifo {

    //No haria falta crear una clase entero con un atributo de tipo char, 
    //ya que usando la clase envolvente Character (Es un bojeto de tipo char ya seria suficiente)
    private ArrayList<Character> listaPila;
    private int tamanioPila;

    //Constructor parametrizado, se añadiria el tamaño que tendria la lista
    public MetodosArrayListLifo(int tamanioPila) {
        this.tamanioPila = tamanioPila;
        this.listaPila = new ArrayList<>();
    }

    //Metodo par agregar un char a la lista pasandolo como parametro
    public void push(char numero) {

        //Si el tamaño de la pila pasado en el cosntructor es mayor al tamaño de la lista se podra agregar mas numeros
        if (this.tamanioPila > listaPila.size()) {

            listaPila.add(numero);

            //Si no la pila estaria desbordada
        } else {
            System.out.println("Pila desbordada, no se pueden agregar mas numeros");

        }

    }

    //Metodo que eliminaria el ultimo elemento de la lista
    public void pop() {

        if (!listaPila.isEmpty()) {
            //Para ello se haria listaPila.size() indicando el numero total de elementos -1 para eliminar la ultima posicion
            listaPila.remove(listaPila.size() - 1);
        }

    }

    //Metodo para indicar si esta vacia la lista, devuelve un booleano
    public boolean estaVacia() {

        return listaPila.isEmpty();

    }

    //Metodo que indica si la lista esta llena o no
    public void estaLlena() {

        //Si el tamaño de la lista (numero de elementos) es igual al tamaño pasado a la lista, estaria llena
        if (listaPila.size() == this.tamanioPila) {

            System.out.println("La pila esta llena");
        } else {

            System.out.println("La pila no esta llena");
        }
    }

    //Metodo que devuelve el tamaño de la lista
    public int getElementos() {

        return listaPila.size();

    }

    //Metodo para imprimir la lsita con un bucle for-each
    public void imprimirLista() {

        for (char numero : listaPila) {

            System.out.print(numero + " , ");
        }

        System.out.println("");
    }

    //En este metodo se pasa un char de array. El tamaño de la pila se reajusta al tamaño del arrya de char pasado como parametro
    //Realmente en este metodo estas rellenando el arraylist de la pila no el array pasado como parametro
    public void rellenar(char[] array) {

        //Con clear eliminas todos los elmentos de la lista, para que estos no se alamcenen y se repitan en la lista
        listaPila.clear();

        //Inicializao el tamaño de la pila con la longitud del array pasado por parametro
        this.tamanioPila = array.length;

        //Se recorre el arrya con .length
        for (int i = 0; i < array.length; i++) {

            //Se hace uso del metodo push por cada posicion para ir rellenado el array
            push(array[i]);
        }

    }

    //En este metodo una vez rellenado el arrayList con los char del array se sacaran dichos elementos en un nuevo array de char
    public char[] sacaElmentos() {

        //Se crea un array de char con el tamaño del arrayList
        char[] array = new char[listaPila.size()];

        //Se recorre el array
        for (int i = 0; i < array.length; i++) {

            //Se almacena en cada posicion del array cada una de las posiciones del arraylist de la pila
            array[i] = listaPila.get(i);
        }

        return array;

    }

    public int getTamanioPila() {
        return tamanioPila;
    }

    public void setTamanioPila(int tamanioPila) {
        this.tamanioPila = tamanioPila;
    }

    @Override
    public String toString() {
        return "Pila{" + "listaPila=" + listaPila + '}';
    }

}

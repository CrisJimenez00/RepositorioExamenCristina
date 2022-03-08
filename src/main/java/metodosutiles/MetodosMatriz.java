/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosutiles;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class MetodosMatriz {

    private Random random;
    private int[][] matriz;

    public MetodosMatriz() {
        random = new Random();
        int numero = random.nextInt(6) + 4;
        this.matriz = new int[numero][numero];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    public ArrayList<Integer> recorrerFila(int i) {
        ArrayList<Integer> lista = new ArrayList<>();

        if (i >= 0 && i < matriz.length) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == i) {
                    for (int k = 0; k < matriz[i].length; k++) {
                        lista.add(matriz[j][k]);
                    }
                }
            }
        }

        return lista;
    }

    public ArrayList<Integer> recorrerColumna(int j) {
        ArrayList<Integer> lista = new ArrayList<>();

        if (j >= 0 && j < matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int k = 0; k < matriz[i].length; k++) {
                    if (k == j) {

                        lista.add(matriz[i][k]);

                    }
                }
            }
        }

        return lista;
    }

    //metodo el cual coge las posiciones vecinas con coordenadas
    public ArrayList<Integer> recorrerVecinas(int i, int j) {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("El número centrar es: " + matriz[i][j]);
        int valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0, valor7 = 0, valor8 = 0;
        valor1 = matriz[i - 1][j - 1];
        valor2 = matriz[i - 1][j];
        valor3 = matriz[i - 1][j + 1];
        valor4 = matriz[i][j - 1];
        valor5 = matriz[i][j + 1];
        valor6 = matriz[i + 1][j - 1];
        valor7 = matriz[i + 1][j];
        valor8 = matriz[i + 1][j + 1];
        lista.add(valor1);
        lista.add(valor2);
        lista.add(valor3);
        lista.add(valor4);
        lista.add(valor5);
        lista.add(valor6);
        lista.add(valor7);
        lista.add(valor8);

        return lista;
    }

    //matriz recoge numero vecinos con doble bucle for
    public void recorrerVecinasConFor(int fila, int columna) {
        System.out.println("El número centrar es: " + matriz[fila][columna]);
        System.out.println("La vecina es: ");

        //Primero que los valores metidos por parámetros son correctos
        if (fila < matriz.length && fila >= 0) {
            if (columna < matriz[fila].length && columna >= 0) {

                //Recorremos la matriz y miramos que no se salga con if
                for (int i = fila - 1; i <= fila + 1; i++) {

                    if (i < matriz.length && i >= 0) {

                        for (int j = columna - 1; j <= columna + 1; j++) {

                            if (j < matriz[i].length && j >= 0) {
                                System.out.print(matriz[i][j] + "\t");

                            }
                        }

                    }
                }
            }
        }
    }

    //metodo el cual imprime la matriz
    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}

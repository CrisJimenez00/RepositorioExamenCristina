/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosutiles;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class TryCatchYRandom {

    //Método el cual controla la excepción con int
    private static int pedirInt() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int numero = 0;
        do {
            // Bloque try. Aquí se pone el código susceptible de error
            try {
                System.out.println("Introduce un dato int: ");
                numero = teclado.nextInt();
                seguir = false;

            } catch (InputMismatchException ime) {

                System.out.println("Cuidado pecador, te has equivocado. "
                        + "Introduce solo números");
                teclado.nextLine();
            }
        } while (seguir);
        return numero;
    }

    //para controlar la excepción de number format
    private static void numerFormat() {
        int numero1 = 0, numero2 = 0, division = 0;

        String numero1Txt = JOptionPane.showInputDialog("Introduce el número 1 (dividendo): ");
        JOptionPane.showMessageDialog(null, numero1Txt);
        try {
            numero1 = Integer.parseInt(numero1Txt);
        } catch (NumberFormatException nfe) {
            //Código para tratar el error
            JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Tendrá valor 1");
            numero1 = 1;
        }

        JOptionPane.showMessageDialog(null, numero1);

    }

    //********METODOS*********
    //*****PARA GENERAR LOS ALEATORIOS********
    //Método privado el cual genera un número aleatorio entre dos 
    //márgenes introducidos por parámetros
    public int numAleatorio(int numMinimo, int numMaximo) {

        int aleatorio;
        Random random = new Random();
        aleatorio = random.nextInt(numMaximo - numMinimo + 1) + numMinimo;
        return aleatorio;
    }
    //*******PARA LEER DATOS POR TECLADO*******
    //Metodo privado el cual lee los datos por scanner 
    //y controla excepciones(que no se introduzca números en los nextInt())

    public int leerDato() {
        Scanner teclado = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;
        do {
            try {
                //Bloque candidato a lanzar la excepcion
                System.out.println("El número será: ");
                numero = teclado.nextInt();

                //Para controlar que los datos están correctamente introducidos.
                solicitarDatos = false;
            } catch (InputMismatchException ime) {

                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (solicitarDatos); // Bucle que controla la excepción

        return numero;

    }
    //Sintaxis de la clase:
    //1º Atributos, campos, propiedades
    //2º Métodos
    //3º Constructores
    //4º Getters y Setters
    //5º toString
    /*
    Si pone "recibe" es que se mete por parámetros
    Sobrecargado significa mismo nombre pero distintos parámetros
    
     */
}

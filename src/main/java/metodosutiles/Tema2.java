/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosutiles;

import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class Tema2 {

    public static void main(String[] args) {

/*
        //Declaración de variables
        int var1, var2;
        
        //Cuidaco con los nombre -> CamelCase
        double estaturaPersona;

        //Inicialización de variables
        var1 = 12;
        var2 = 14;

        //Puedo declarar e inicializar de variables del mismo tipo en la misma 
        //instrucción(de otro tipo no se puede)
        float pesoPersona = 67.6f;
        long millonesQueMeVaisAPagar = 23_000_000_000l;

        //Constantes
        //De normal se inicializa cuando se declara
        final boolean SIEMPRE_SI = true;

        //Al ser constante no puede cambiar su valor
        //SIEMPRE_SI = false;
        //Literales son los valores concretos de un tipo de dato
        //(Seguramente lo ponga en algún ejercicio, cuidado).
        long numero1 = 23;// int--> long (conversión implícita)
        long numero2 = 23l;// si ponemos = (long) 23 sería conversión 
        //explícita o canting explícito.

        //Explícito es que aparece(lo pones tú), el implícito 
        //no se ve (int dentro de long porque cabe)
        long expresion = 12 / 6; // Al ser una división de enteros se almacenaría un entero
        long expresion2 = 12 / 5;// Se come los decimales porque es una división de enteros
        //Un long no es de tipo real entonces daría error si ponemos 12.0

        //Math call, floor, round
        double expresion3 = Math.ceil(3.4);//Redondea un número hacía arriba. Va a la unidad más
        //Ceil es techo == siempre pa' arriba
        //En este caso hacia 4
        System.out.println(expresion3);

        expresion3 = Math.floor(4.9);//redondea  hacia abajo
        //Floor es suelo == Siempre pa' abajo
        System.out.println(expresion3);

        expresion3 = Math.round(4.2);//redondea de verdad je(5 o más para arriba)
        System.out.println(expresion3);
        expresion3 = Math.round(4.8);
        System.out.println(expresion3);
        expresion3 = Math.round(4.5);
        System.out.println(expresion3);

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduzca el peso de la persona: ");
        pesoPersona = teclado.nextFloat();

        System.out.println("Introduzca la estatura");
        estaturaPersona = teclado.nextDouble();

        double imc = pesoPersona / Math.pow(estaturaPersona, 2);
        System.out.printf("El IMC de la persona es: %.2f", imc);
        

METODOS MATEMATICOS
-----------RAICES CUADRADAS/ VALOR ABSOLUTO
      double solucion = Math.sqrt(Math.pow((valorX2 - valorX1), 2) + Math.pow((valorY2 - valorY1), 2));
        Con Math.abs (sale un número con valor absoluto, es decir, siempre positvio)
        
------------FORMATEAR LOS DECIMALES
        DecimalFormat df = new DecimalFormat("#.00");
        String resultado = df.format(pasadoAMetros);
        NumberFormat numeroResultado = NumberFormat.getInstance(pasadoAMetros);

METODOS PARA FORMATEAR LOS SOUT(CON RPRINTF)
----------FORMATEOS POR SOUT

        Como funciona el printf(QUE NO SE ME OLVIDE QUE SE USA)
        
        printf("%._f", a);
        
        El _ es el número de decimales que queremos que salga
        a es la variable que queremos mostrar con el número de decimales que hayamos puesto ne lugar de _

        
        printf("%.2f %.3f",a,b);
        En este caso el 2f afecta al valor a y 3f a b
        Entre %.2f %.3f hay un espacio
        
         */

        //Lectura con JOptionPane
        String apellido = JOptionPane.showInputDialog(null, "Introduce tu apellido");

        System.out.println(apellido);

        //Por consola coma y por JOption punto
        String dinerosTexto = JOptionPane.showInputDialog("Introduce el dinero "
                + "para sobornar al de programación");
        double dineros = Double.parseDouble(dinerosTexto);

        System.out.println(
                "El profe va a recibir: " + (dineros * 12) + "€ al año");
        //Si no se pone parentesis no ejecuta la cuenta
        JOptionPane.showMessageDialog(
                null, "El profe va a recibir: " + (dineros * 12) + "€ al año");
    }

}

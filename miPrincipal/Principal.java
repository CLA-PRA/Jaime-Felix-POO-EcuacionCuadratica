package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Ecuacion Cuadratica");
        System.out.println("===================");
        System.out.println();
        System.out.print("Proporcione el valor del coeficiente a:");
        int a = entrada.nextInt();

        // Crear objeto ecuacion cuadratica
        EcuacionCuadratica ec = new EcuacionCuadratica( a, b, c );

        // Mostrar la ecuacion cuadratica
        System.out.println();
        System.out.println( ec );

        // Mostrar las raices
        if ( ec.getDiscriminante() > 0 )
        {
        }
        else if ( ec.getDiscriminante() == 0 )
        {
        }
        else
        {
        }

        entrada.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "Operaciones Matematicas\n\n";
        double suma;
        double multiplicacion;
        double division;
        double residuo;
        double potencia;
        double resta;
        int opcion;
        double num1;
        double num2;

        System.out.println("Ingrese la operacion matematica.\n"
                + "1 Suma\n"
                + "2 Resta\n"
                + "3 Multiplicacion\n"
                + "4 Division\n"
                + "5 Modulo\n"
                + "6 Potencia\n");
        opcion = entrada.nextInt(); // 4
        if (opcion >= 7 || opcion <= 0) {
            System.out.println("Ninguna de la opciones es correcta");
        } else {
            System.out.println("Ingrese el valor del primer numero");
            num1 = entrada.nextDouble();
            cadenaFinal = String.format("%sPrimer numero:%s\n", cadenaFinal, num1);
            System.out.println("Ingrese el valor del segundo numero");
            num2 = entrada.nextDouble();
            cadenaFinal = String.format("%sSegundo numero:%s\n", cadenaFinal, num2);

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    cadenaFinal = String.format("%sOperacion seleccionada: Suma\n\n"
                            + "Resultado: %s ", cadenaFinal, suma);
                    break;

                case 2:
                    resta = num1 - num2;
                    cadenaFinal = String.format("%sOperacion seleccionada:Resta\n\n"
                            + "Resultado: %s ", cadenaFinal, resta);
                    break;

                case 3:
                    multiplicacion = num1 * num2;
                    cadenaFinal = String.format("%sOperacion seleccionada: Multiplicacion\n\n"
                            + "Resultado:%s", cadenaFinal, multiplicacion);
                    break;
                case 4:
                    division = num1 / num2;
                    cadenaFinal = String.format("%sOperacion seleccionada: Division\n\n"
                            + "Resultado:%s", cadenaFinal, division);
                    break;

                case 5:
                    residuo = num1 % num2;
                    cadenaFinal = String.format("%sOperacion seleccionada: Residuo\n\n"
                            + "Resultado:%s", cadenaFinal, residuo);
                    break;
                case 6:
                    potencia = Math.pow(num1, num2);
                    cadenaFinal = String.format("%sOperacion seleccionada: Potencia\n\n"
                            + "Resultado:%s", cadenaFinal, potencia);

                default:
                    System.out.println("ninguna de las opciones anteriores es "
                            + "correcta");
                    break;
            }
            System.out.printf("%s", cadenaFinal);

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "Peaje \"Buena via\"\n\n";
        String propi;
        double avaluo;
        double porcentaje;
        double valorBase;
        double recargo = 0;
        double total;
        int opcion;
        double peaje;

        System.out.println("Ingrese su tipo de vehiculo\n"
                + "1 Vehiculo liviano particular\n"
                + "2 Vehiculo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus urbano\n");
        opcion = entrada.nextInt(); // 4
        if (opcion >= 5 || opcion <= 0) {
            System.out.println("Ninguna de la opciones es valida");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del propietario");
            propi = entrada.nextLine();
            cadenaFinal = String.format("%sPropietario: %s\n", cadenaFinal, propi);
            System.out.println("Ingrese el valor del avaulo del vehiculo");
            avaluo = entrada.nextDouble();

            switch (opcion) {

                case 1:
                    porcentaje = 0.0001;
                    valorBase = 2.00;
                    peaje = avaluo * porcentaje;
                    peaje = peaje + valorBase;
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    }
                    total = peaje + recargo;
                    cadenaFinal = String.format("%sTipo de vehiculo: Vehículo liviano particular\n"
                            + "Avaluo: $%.2f\n"
                            + "Valor base del peaje: $%.2f\n"
                            + "Recargo: $%.2f\n\n"
                            + "Total a cancelar: $%.2f\n", cadenaFinal, avaluo, peaje, recargo, total);
                    break;

                case 2:
                    porcentaje = 0.0002;
                    valorBase = 2.50;
                    peaje = avaluo * porcentaje;
                    peaje = peaje + valorBase;
                    if (avaluo > 30000) {
                        recargo = 1.50;
                    }
                    total = peaje + recargo;
                    cadenaFinal = String.format("%sTipo de vehiculo: Vehículo liviano particular\n"
                            + "Avaluo: $%.2f\n"
                            + "Valor base del peaje: $%.2f\n"
                            + "Recargo: $%.2f\n\n"
                            + "Total a cancelar: $%.2f\n", cadenaFinal, avaluo, peaje, recargo, total);
                    break;

                case 3:
                    porcentaje = 0.0004;
                    valorBase = 1.50;
                    peaje = avaluo * porcentaje;
                    peaje = peaje + valorBase;
                    recargo = 0;
                    total = peaje + recargo;
                    cadenaFinal = String.format("%sTipo de vehiculo: Vehículo liviano particular\n"
                            + "Avaluo: $%.2f\n"
                            + "Valor base del peaje: $%.2f\n"
                            + "Recargo: $%.2f\n\n"
                            + "Total a cancelar: $%.2f\n", cadenaFinal, avaluo, peaje, recargo, total);
                    break;
                case 4:
                    porcentaje = 0.0005;
                    valorBase = 2.20;
                    peaje = avaluo * porcentaje;
                    peaje = peaje + valorBase;
                    recargo = 0;
                    total = peaje + recargo;
                    cadenaFinal = String.format("%sTipo de vehiculo: Vehículo liviano particular\n"
                            + "Avaluo: $%.2f\n"
                            + "Valor base del peaje: $%.2f\n"
                            + "Recargo: $%.2f\n\n"
                            + "Total a cancelar: $%.2f\n", cadenaFinal, avaluo, peaje, recargo, total);
                    break;
                default:
                    System.out.println("ninguna de las opciones anteriores es "
                            + "valida");
                    break;
            }
            System.out.printf("%s", cadenaFinal);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal = "REPORTE DE INCREMENTO SALARIAL\n\n";
        String nombre;
        int tipoEmpleado;
        int aniosServicio;
        double sueldoInicial;
        double porcentaje = 0;
        double incremento;
        double bonificacion = 0;
        double nuevoSueldo;

        // Entrada de datos
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado = entrada.nextInt();
        System.out.println("Ingrese los años de servicio");
        aniosServicio = entrada.nextInt();
        System.out.println("Ingrese el sueldo inicial");
        sueldoInicial = entrada.nextDouble();

        // Datos del empleado
        cadenaFinal = String.format("%sEmpleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n",
                cadenaFinal, nombre, tipoEmpleado, aniosServicio);

        // Porcentaje según el tipo de empleado
        switch (tipoEmpleado) {
            case 1:
                porcentaje = 5;
                break;
            case 2:
                porcentaje = 7;
                break;
            case 3:
                porcentaje = 9;
                break;
            case 4:
                porcentaje = 12;
                break;
            default:
                porcentaje = 15;
                break;
        }

        // Bonificación según los años de servicio
        if (aniosServicio < 2) {
            bonificacion = 0.00;
        } else if (aniosServicio < 5) {
            bonificacion = 30.00;
        } else if (aniosServicio < 10) {
            bonificacion = 60.00;
        } else {
            bonificacion = 100.00;
        }

        // Cálculos
        incremento = sueldoInicial * porcentaje / 100;
        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        // Resultados
        cadenaFinal = String.format("%sSueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %.0f%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                cadenaFinal, sueldoInicial, porcentaje, incremento,
                bonificacion, nuevoSueldo);

        System.out.printf("%s", cadenaFinal);
    }
}

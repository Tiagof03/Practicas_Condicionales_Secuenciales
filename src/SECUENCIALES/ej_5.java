package SECUENCIALES;

import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        // Pedir al usuario la distancia del viaje en kilómetros
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        Scanner entrada = new Scanner(System.in);
        double distancia = entrada.nextDouble();

        // Pedir al usuario el consumo de combustible en litros por kilómetro
        System.out.print("Ingrese el consumo de combustible del vehículo (Ej: 8 litros cada 100km, ingresa 8 litros): ");
        Scanner entrada2 = new Scanner(System.in);
        double consumo = entrada2.nextDouble();

        // Pedir al usuario el precio del combustible por litro
        System.out.print("Ingrese el precio del combustible por litro: ");
        Scanner entrada3 = new Scanner(System.in);
        double precioPorLitro = entrada3.nextDouble();

        // Calcular el costo total del viaje
        double litrosNecesarios = (distancia / consumo);
        double costoTotal = litrosNecesarios * precioPorLitro;

        // Imprimir el costo total del viaje
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);
    }
}

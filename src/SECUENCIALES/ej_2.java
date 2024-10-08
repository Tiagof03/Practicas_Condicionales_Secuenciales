package SECUENCIALES;

import java.util.Scanner;
public class ej_2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en minutos y
        // el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las calorías quemadas.
        // Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de ejercicio.
        System.out.println("Ingrese su peso en kilogramos");
        Scanner entrada = new Scanner(System.in);
        double peso;
        peso=entrada.nextDouble();
        System.out.println("Ingrese el ejercicio realizado");
        System.out.println("1-Ciclismo");
        System.out.println("2-Correr");
        System.out.println("3-Natación");
        Scanner entrada2 = new Scanner(System.in);
        int op= entrada2.nextInt();
        System.out.println("Ingrese los minutos de actividad");
        Scanner entrada3 = new Scanner(System.in);
        int minutos= entrada3.nextInt();
        double met = 0; //MET (Metabolic Equivalent of Task)
        //Primero asinamos valor a met
        switch (op) {
            case 1:
                met = 8.8;
                break;
            case 2:
                met = 8.3;
                break;
            case 3:
                met = 7.0;
                break;
            default:
                System.out.println("Opción no válida");
        }
        //Ahora calculamos las calorias quemadas
        double caloriasquemadas;
            caloriasquemadas = met * peso * (minutos / 60.0);
        // Mostrar el resultado
        System.out.println("Las calorias quemadas son: "+ caloriasquemadas);

    }
}

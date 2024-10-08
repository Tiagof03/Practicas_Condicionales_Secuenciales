package SECUENCIALES;
import java.util.Scanner;

import static java.util.Scanner.*;

public class ej_3 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio, avanzado)
        // y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y duraciones.
        System.out.println("Hola ingrese su nivel de condición física");
        System.out.println("1-Principiante");
        System.out.println("2-Intermedio");
        System.out.println("3-Avanzado");
        Scanner entrada= new Scanner(System.in);
        int nivel;
        nivel=entrada.nextInt();
        // Generar la rutina de ejercicio semanal según el nivel
        generarRutina(nivel);
    }
    public static void generarRutina(int nivel) {
        switch (nivel) {
            case 1:
                System.out.println("\nRutina para Principiantes:");
                rutinaPrincipiante();
                break;
            case 2:
                System.out.println("\nRutina Intermedia:");
                rutinaIntermedia();
                break;
            case 3:
                System.out.println("\nRutina Avanzada:");
                rutinaAvanzada();
                break;
            default:
                System.out.println("Nivel no válido. Por favor, selecciona 1, 2 o 3.");
        }
    }
    public static void rutinaPrincipiante() {
        System.out.println("Lunes - Caminar rápido (30 minutos)");
        System.out.println("Martes - Yoga/Pilates (30 minutos)");
        System.out.println("Miércoles - Ciclismo suave (20 minutos)");
        System.out.println("Jueves - Entrenamiento de fuerza ligero (20 minutos)");
        System.out.println("Viernes - Nadar moderado (20 minutos)");
        System.out.println("Sábado - Descanso");
        System.out.println("Domingo - Caminata ligera (30 minutos)");
    }
    public static void rutinaIntermedia() {
        System.out.println("Lunes - Ciclismo moderado (45 minutos)");
        System.out.println("Martes - Entrenamiento de fuerza con pesas (40 minutos)");
        System.out.println("Miércoles - Correr a ritmo moderado (35 minutos)");
        System.out.println("Jueves - Natación estilo libre moderado (30 minutos)");
        System.out.println("Viernes - Entrenamiento HIIT (25 minutos)");
        System.out.println("Sábado - Yoga o estiramiento activo (30 minutos)");
        System.out.println("Domingo - Descanso");
    }
    public static void rutinaAvanzada() {
        System.out.println("Lunes - Correr (60 minutos)");
        System.out.println("Martes - Entrenamiento de fuerza intensivo (45 minutos)");
        System.out.println("Miércoles - Ciclismo rápido (60 minutos)");
        System.out.println("Jueves - Natación intensa (40 minutos)");
        System.out.println("Viernes - Entrenamiento HIIT avanzado (35 minutos)");
        System.out.println("Sábado - Entrenamiento de resistencia muscular (50 minutos)");
        System.out.println("Domingo - Descanso o estiramientos ligeros");
    }
}


package CONDICIONALES;
import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántas horas duerme al día
        System.out.print("¿Cuántas horas al día duermes? ");
        int horasDormir = scanner.nextInt();

        // Pedir al usuario cuántas horas hace ejercicio al día
        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        // Pedir al usuario cuántas comidas saludables consume al día
        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        // Evaluar los hábitos saludables
        System.out.println("\nEvaluación de tus hábitos saludables:");

        // Evaluación de horas de sueño
        if (horasDormir < 7) {
            System.out.println("No estás durmiendo lo suficiente. Se recomienda dormir entre 7 y 9 horas.");
        } else if (horasDormir <= 9) {
            System.out.println("¡Buen trabajo! Estás durmiendo suficiente.");
        } else {
            System.out.println("Estás durmiendo demasiado. Se recomienda dormir entre 7 y 9 horas.");
        }

        // Evaluación de horas de ejercicio
        if (horasEjercicio < 1) {
            System.out.println("No haces suficiente ejercicio. Se recomienda al menos 1 hora al día.");
        } else if (horasEjercicio <= 2) {
            System.out.println("¡Excelente! Estás haciendo una buena cantidad de ejercicio.");
        } else {
            System.out.println("Haces mucho ejercicio, ¡bien hecho! Asegúrate de no exagerar y descansar lo suficiente.");
        }

        // Evaluación de comidas saludables
        if (comidasSaludables < 2) {
            System.out.println("Intenta aumentar tu consumo de comidas saludables.");
        } else if (comidasSaludables <= 3) {
            System.out.println("¡Buen trabajo! Estás consumiendo una cantidad adecuada de comidas saludables.");
        } else {
            System.out.println("¡Fantástico! Estás priorizando tus comidas saludables.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

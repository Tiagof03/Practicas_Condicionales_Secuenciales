package CONDICIONALES;
import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su estado de ánimo
        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Recomendar una actividad según el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Genial! Te recomendamos que salgas a pasear o disfrutes de un día con amigos.");
                break;
            case "triste":
                System.out.println("Lamentamos que te sientas así. Tal vez ver una película divertida o leer un buen libro te ayude.");
                break;
            case "enérgico":
                System.out.println("¡Fantástico! ¿Por qué no haces ejercicio, como salir a correr o bailar?");
                break;
            case "relajado":
                System.out.println("Perfecto. Es un buen momento para meditar, practicar yoga o disfrutar de un baño relajante.");
                break;
            default:
                System.out.println("No reconozco ese estado de ánimo. Por favor, elige entre: feliz, triste, enérgico, relajado.");
                break;
        }

        // Cerrar el scanner
        scanner.close();
    }
}

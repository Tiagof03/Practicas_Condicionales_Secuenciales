package CONDICIONALES;
import java.util.Random;
import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones disponibles
        String[] opciones = {"piedra", "papel", "tijera"};

        // Pedir al usuario que elija una opción
        System.out.println("Elige una opción (piedra, papel, tijera): ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Validar la elección del usuario
        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.println("Opción no válida. Por favor, elige piedra, papel o tijera.");
            scanner.close();
            return; // Termina el programa si la opción es inválida
        }

        // Elegir una opción al azar para la computadora
        int indiceComputadora = random.nextInt(3); // 0, 1 o 2
        String eleccionComputadora = opciones[indiceComputadora];

        // Mostrar la elección de la computadora
        System.out.println("La computadora eligió: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste! La computadora gana.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

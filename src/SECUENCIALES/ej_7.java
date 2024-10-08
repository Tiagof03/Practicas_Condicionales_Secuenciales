package SECUENCIALES;
import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar variables para los factores de felicidad
        int satisfaccionVida;
        int nivelEstres;
        int nivelSalud;
        int nivelRelaciones;
        int nivelFelicidad;

        // Solicitar al usuario los factores de felicidad
        System.out.print("¿Cuál es tu nivel de satisfacción con la vida? (1-10): ");
        satisfaccionVida = scanner.nextInt();

        System.out.print("¿Cuál es tu nivel de estrés? (1-10): ");
        nivelEstres = scanner.nextInt();

        System.out.print("¿Cuál es tu nivel de salud? (1-10): ");
        nivelSalud = scanner.nextInt();

        System.out.print("¿Cuál es tu nivel de relaciones interpersonales? (1-10): ");
        nivelRelaciones = scanner.nextInt();

        System.out.print("¿Cuál es tu nivel de felicidad general? (1-10): ");
        nivelFelicidad = scanner.nextInt();

        // Calcular el índice de felicidad
        double indiceFelicidad = (satisfaccionVida + (10 - nivelEstres) + nivelSalud + nivelRelaciones + nivelFelicidad) / 5.0;

        // Imprimir el resultado
        System.out.println("Tu índice de felicidad es: " + indiceFelicidad);

        scanner.close();
    }
}

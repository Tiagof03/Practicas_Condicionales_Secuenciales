package CONDICIONALES;
import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su peso en kilogramos
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario su altura en metros
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Imprimir el IMC
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f%n", imc);

        // Imprimir recomendación basada en el IMC
        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
            System.out.println("Recomendación: Es recomendable consultar a un profesional de la salud.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Categoría: Peso normal");
            System.out.println("Recomendación: Mantén un estilo de vida saludable.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Categoría: Sobrepeso");
            System.out.println("Recomendación: Considera hacer cambios en tu dieta y actividad física.");
        } else {
            System.out.println("Categoría: Obesidad");
            System.out.println("Recomendación: Es recomendable consultar a un profesional de la salud.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

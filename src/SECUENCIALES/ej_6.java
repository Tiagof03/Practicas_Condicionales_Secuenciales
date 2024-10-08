package SECUENCIALES;
import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántas horas al día puede estudiar
        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = scanner.nextInt();

        // Definir las materias
        String[] materias = {
                "Python",
                "Programación",
                "Organización Empresarial",
                "Matemáticas",
                "Arquitectura y Sistemas Operativos"
        };

        // Calcular las horas de estudio semanales
        int horasPorSemana = horasPorDia * 7;

        // Calcular las horas por materia (distribuir equitativamente)
        int horasPorMateria = horasPorSemana / materias.length;

        // Imprimir el plan de estudio
        System.out.println("\nPlan de estudio semanal:");
        for (String materia : materias) {
            System.out.printf("%s: %d horas\n", materia, horasPorMateria);
        }

        // Si hay horas sobrantes, distribuirlas
        int horasSobrantes = horasPorSemana % materias.length;
        for (int i = 0; i < horasSobrantes; i++) {
            System.out.printf("%s: %s (1 hora extra)\n", materias[i], "Extra");
        }

        scanner.close();
    }
}

package SECUENCIALES;

import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args) {
        System.out.println("Hola ¿Cual es tu estado de animo?");
        System.out.println("1-Feliz");
        System.out.println("2-Triste");
        System.out.println("3-Enérgetico");
        System.out.println("4-Relajado");
        Scanner entrada= new Scanner(System.in);
        int op = entrada.nextInt();
        switch (op){
            case 1:
                System.out.println("Feliz:");
                System.out.println("Lista de reproducción sugerida:");
                System.out.println("Color esperanza - Diego Torres");
                System.out.println("Bicicleta - Carlos Vives y Shakira");
                System.out.println("La Cumbia de los Trapos - Yerba Brava");
                break;
            case 2:
                System.out.println("Triste:");
                System.out.println("Lista de reproducción sugerida:");
                System.out.println("Un Vestido y Un Amor - Fito Páez");
                System.out.println("Alfonsina y el Mar - Mercedes Sosa");
                System.out.println("11 y 6 - Fito Páez");
                break;
            case 3:
                System.out.println("Enérgetico:");
                System.out.println("Lista de reproducción sugerida:");
                System.out.println("Gente Que No - La Vela Puerca");
                System.out.println("Cerveza - La Renga");
                System.out.println("Soy Yo - La Beriso");
                break;
            case 4:
                System.out.println("Relajado:");
                System.out.println("Lista de reproducción sugerida:");
                System.out.println("De Música Ligera - Soda Stereo");
                System.out.println("Nada Personal - Soda Stereo");
                System.out.println("Gracias a la Vida - Mercedes Sosa");
                break;
        }


    }
}

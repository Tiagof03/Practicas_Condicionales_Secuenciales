package CONDICIONALES;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {

        System.out.println("Ingrese su genero de Libros favorito");
        System.out.println("1-Fantasia");
        System.out.println("2-Misterio");
        System.out.println("3-Romance");
        System.out.println("4-Ciencia ficcion");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        System.out.println("Su genero de Libro favorito es: "+ op);
        switch (op){
            case 1:
                System.out.println("Cuentos de la selva de Horacio Quiroga");
                break;
            case 2:
                System.out.println("El túnel de Ernesto Sabato");
                break;
            case 3:
                System.out.println("Las cosas que perdimos en el fuego de Mariana Enriquez");
                break;
            case 4:
                System.out.println("Los premios de Julio Cortázar");
        }
    }
}

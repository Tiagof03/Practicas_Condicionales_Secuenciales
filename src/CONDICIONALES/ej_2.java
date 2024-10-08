package CONDICIONALES;
import java.util.Scanner;

public class ej_2 {
        public static void main(String[] args) {
                // Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente (estudiante, adulto, jubilado).
                // Aplica un descuento del 10% para estudiantes, 5% para adultos y 15% para jubilados. Imprime el precio final
                // después del descuento.

                Scanner entrada = new Scanner(System.in);

                // Solicitar el precio del producto
                System.out.println("Ingrese el precio del producto: ");
                int precio = entrada.nextInt();

                // Mostrar las opciones de categorías
                System.out.println("Seleccione la categoría del cliente:");
                System.out.println("1 - Estudiante");
                System.out.println("2 - Adulto");
                System.out.println("3 - Jubilado");

                // Leer la opción de categoría
                int op = entrada.nextInt();
                float resultado = 0;

                // Calcular el precio final según la categoría
                if (op == 1) {
                        System.out.println("Por ser estudiante, tu descuento es del 10%");
                        resultado = precio - ((precio * 10) / 100);
                } else if (op == 2) {
                        System.out.println("Por ser adulto, tu descuento es del 5%");
                        resultado = precio - ((precio * 5) / 100);
                } else if (op == 3) {
                        System.out.println("Por ser jubilado, tu descuento es del 15%");
                        resultado = precio - ((precio * 15) / 100);
                } else {
                        System.out.println("Categoría no válida. No se aplicará descuento.");
                        resultado = precio;
                }

                // Imprimir el precio final después del descuento
                System.out.println("El precio final es: " + resultado);

                entrada.close(); // Cerramos el scanner
        }
}

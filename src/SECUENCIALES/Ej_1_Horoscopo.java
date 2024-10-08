package SECUENCIALES;

import java.util.Scanner;

public class Ej_1_Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha de nacimiento
        System.out.print("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();
        scanner.close();

        // Dividir la fecha de nacimiento en día, mes y año
        String[] fecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);

        // Determinar el signo del zodiaco
        String signo = obtenerSignoZodiaco(dia, mes);
        String mensaje = obtenerMensajeHoroscopo(signo);

        // Imprimir el signo y el mensaje de horóscopo
        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("Mensaje de horóscopo: " + mensaje);
    }

    public static String obtenerSignoZodiaco(int dia, int mes) {
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 &&
                dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else {
            return "Desconocido";
        }
    }

    public static String obtenerMensajeHoroscopo(String signo) {
        switch (signo) {
            case "Acuario":
                return "Hoy es un buen día para tomar decisiones importantes en tu vida.";
            case "Piscis":
                return "Estás lleno de creatividad, ¡aprovéchalo!";
            case "Aries":
                return "La energía está de tu lado para emprender nuevos proyectos.";
            case "Tauro":
                return "Es un buen momento para fortalecer tus relaciones personales.";
            case "Géminis":
                return "Hoy será un día lleno de aprendizajes.";
            case "Cáncer":
                return "Las emociones estarán a flor de piel, pero sabrás cómo manejarlas.";
            case "Leo":
                return "El éxito te sigue, solo debes confiar en ti mismo.";
            case "Virgo":
                return "Tu atención al detalle te llevará lejos hoy.";
            case "Libra":
                return "El equilibrio y la armonía serán tus aliados.";
            case "Escorpio":
                return "Tu pasión te llevará a cumplir tus objetivos.";
            case "Sagitario":
                return "Hoy es un buen día para explorar nuevas ideas.";
            case "Capricornio":
                return "La perseverancia será tu mayor fortaleza hoy.";
            default:
                return "No se pudo determinar el horóscopo.";
        }
    }
}

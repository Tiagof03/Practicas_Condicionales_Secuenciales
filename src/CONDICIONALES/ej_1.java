package CONDICIONALES;

import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su género de película favorito
        // (acción, comedia, drama, ciencia ficción) y luego recomiende una película basada en su elección.
        System.out.println("Ingrese su genero de pelicula favorito");
        System.out.println("1-acción");
        System.out.println("2-Comedia");
        System.out.println("3-Drama");
        System.out.println("4-Ciencia Ficción");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        System.out.println("Su genero de pelicula favorito es: "+ op);
        switch (op){
            case 1:
                System.out.println("Acción:\n" +
                        "Mad Max: Fury Road \n" +
                        "Un viaje trepidante por un desierto postapocalíptico donde Max y Furiosa luchan contra un tirano. La película es visualmente impresionante y llena de acción intensa.\n" +
                        "\n" +
                        "Gladiator \n" +
                        "Un general romano que es traicionado y convertido en esclavo se convierte en gladiador para vengarse del emperador que mató a su familia.\n" +
                        "\n" +
                        "The Dark Knight \n" +
                        "La secuela de Batman Begins, donde Batman enfrenta al Joker, un villano caótico que busca sembrar el caos en Gotham City.");
                break;
            case 2:
                System.out.println("Comedia:\n" +
                        "The Hangover \n" +
                        "Tres amigos intentan reconstruir lo que sucedió la noche anterior tras una despedida de soltero en Las Vegas. Llena de situaciones absurdas y giros hilarantes.\n" +
                        "\n" +
                        "Dumb and Dumber \n" +
                        "Dos amigos increíblemente despistados se embarcan en un viaje a través del país para devolver un maletín lleno de dinero. Es una comedia clásica de situaciones ridículas.\n" +
                        "\n" +
                        "Groundhog Day \n" +
                        "Un hombre se encuentra atrapado en el mismo día, repitiéndolo una y otra vez. Esta película combina humor con un mensaje sobre la vida y el cambio personal.");
                break;
            case 3:
                System.out.println("\n" +
                        "¡Claro! Aquí tienes más recomendaciones para cada género:\n" +
                        "\n" +
                        "Acción:\n" +
                        "Mad Max: Fury Road \n" +
                        "Un viaje trepidante por un desierto postapocalíptico donde Max y Furiosa luchan contra un tirano. La película es visualmente impresionante y llena de acción intensa.\n" +
                        "\n" +
                        "Gladiator \n" +
                        "Un general romano que es traicionado y convertido en esclavo se convierte en gladiador para vengarse del emperador que mató a su familia.\n" +
                        "\n" +
                        "The Dark Knight \n" +
                        "La secuela de Batman Begins, donde Batman enfrenta al Joker, un villano caótico que busca sembrar el caos en Gotham City.\n" +
                        "\n" +
                        "Comedia:\n" +
                        "The Hangover \n" +
                        "Tres amigos intentan reconstruir lo que sucedió la noche anterior tras una despedida de soltero en Las Vegas. Llena de situaciones absurdas y giros hilarantes.\n" +
                        "\n" +
                        "Dumb and Dumber \n" +
                        "Dos amigos increíblemente despistados se embarcan en un viaje a través del país para devolver un maletín lleno de dinero. Es una comedia clásica de situaciones ridículas.\n" +
                        "\n" +
                        "Groundhog Day \n" +
                        "Un hombre se encuentra atrapado en el mismo día, repitiéndolo una y otra vez. Esta película combina humor con un mensaje sobre la vida y el cambio personal.\n" +
                        "\n" +
                        "Drama:\n" +
                        "Schindler's List \n" +
                        "La historia real de Oskar Schindler, un empresario que salvó a más de mil judíos durante el Holocausto. Una película profundamente conmovedora y poderosa.\n" +
                        "\n" +
                        "A Beautiful Mind (2001)\n" +
                        "Basada en la vida del matemático John Nash, quien lucha contra la esquizofrenia mientras intenta hacer grandes avances en su campo. Es un drama emotivo y fascinante.\n" +
                        "\n" +
                        "Forrest Gump \n" +
                        "La historia de un hombre simple que, sin quererlo, participa en algunos de los momentos más importantes de la historia estadounidense, todo mientras busca su lugar en el mundo.");
                break;
            case 4:
                System.out.println("Ciencia Ficción:\n" +
                        "Blade Runner 2049 \n" +
                        "Un oficial de policía descubre un secreto que podría desestabilizar la sociedad y decide buscar al antiguo Blade Runner, Rick Deckard. Visualmente impresionante y con una narrativa profunda sobre la humanidad.\n" +
                        "\n" +
                        "The Matrix \n" +
                        "Un hacker descubre la verdad sobre la realidad en la que vive y se une a una rebelión contra las máquinas que controlan a la humanidad. Revolucionaria en efectos especiales y concepto.\n" +
                        "\n" +
                        "Interstellar \n" +
                        "Un grupo de exploradores viajan a través de un agujero de gusano en busca de un nuevo hogar para la humanidad. Es una aventura cósmica con grandes emociones y ciencia compleja.");

        }




    }
}

import java.util.Scanner;

public class EjercicioCasaDeLosEspejos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Casa de los Espejos");

        var MIN_EDAD = 10;

        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Te da miendo la oscuridad(s/n): ");
        var miedoOscuridad = consola.nextLine();

        //si miedoOscuridad recibe un 's' regresara 'true' miedo
        var miedo = miedoOscuridad.equalsIgnoreCase("s");

        //Algoritmo de condicion
        if(!miedo && edad >= MIN_EDAD){
            System.out.println("Puedes entrar a la casa de los espejos");
        }else{
            System.out.println("Lo siento, la casa de los espejos podria darte miedo");
        }

    }
}

import java.util.Scanner;

public class EjercicioSistemaCalificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Titulo
        System.out.println("*** Sistema de Calificaciones ***");

        //Solicitud de valor
        System.out.print("Ingresa tu calificacion: ");
        var calif = Integer.parseInt(consola.nextLine());

        //Validacion de dato
        switch (calif){
            case 10,9 -> System.out.printf("Tu calificacion es de %d sacaste una 'A' Felicidades!!",calif);
            case 8 -> System.out.printf("Tu calificacion es de %d sacaste una 'B' Bien hecho!!",calif);
            case 7 -> System.out.printf("Tu calificacion es de %d sacaste una 'C' Lo hiciste bien!!",calif);
            case 6 -> System.out.printf("Tu calificacion es de %d sacaste una 'D' Se puede mejorar!!",calif);
            case 5,4,3,2,1,0 -> System.out.printf("Tu calificacion es de %s sacaste una 'F' Que mal :(",calif);
            default -> System.out.printf("El valor proporcionado %d es incorrecto debe ser de 0 a 10", calif);
        }
    }
}

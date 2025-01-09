import java.util.Scanner;

public class EjercicioEstacionAnioMejorado {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Titulo
        System.out.println("*** Estaciones del Año ***\n");

        //Solicitud de datos
        System.out.print("Ingresa el mes que estamos numerico: ");
        var mes = Integer.parseInt(consola.nextLine());

        //Metodo de validacion de mes
        switch (mes){
            case 12,1,2-> System.out.println("Estamos en Invierno");
            case 3,4,5-> System.out.println("Estamos en Primavera");
            case 6,7,8-> System.out.println("Estamos en Verano");
            case 9,10,11 -> System.out.println("Estamos en Otoño");
            default-> System.out.println("Valor adquirido incorrecto");
        }
    }
}

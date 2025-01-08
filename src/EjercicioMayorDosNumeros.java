import java.util.Scanner;

public class EjercicioMayorDosNumeros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Numero Mayor de 2 Numeros ***");

        //Solicitud de informacion
        System.out.print("Ingresa el primer valor: ");
        var valor1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa el segundo valor: ");
        var valor2 = Integer.parseInt(consola.nextLine());

        //Validacion
        if(valor1 > valor2){
            System.out.println("El primer valor " + valor1 + " Es mayor al segundo valor " + valor2);
        }else {
            System.out.println("El segundo valor " + valor2 + " Es mayor al primer valor " + valor1);
        }
    }
}

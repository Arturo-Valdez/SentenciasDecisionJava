import java.util.Scanner;

public class EjercicioNumeroPositivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa el valor: ");
        var valor = Integer.parseInt(consola.nextLine());

        if(valor < 0){
            System.out.println("Tu valor es negativo = " + valor);
        }else if(valor > 0) {
            System.out.println("Tu valor positivo = " + valor);
        }else {
            System.out.println("Tu valor es (positivo/negativo) = " + valor);
        }
    }
}

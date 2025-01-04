import java.util.Scanner;

public class EjercicioSistemaBancario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema Bancario ***");

        System.out.print("Desea salir del sistema (s/n): ");
        var salirSistema = consola.nextLine();

        //Condicional cuando recibe 's' este lo niega con el condicional not
        if(!salirSistema.equalsIgnoreCase("s")){
            System.out.println("Continuamos dentro del sistema...");
        }else{
            System.out.println("Saliendo del sistema...");
        }

    }
}

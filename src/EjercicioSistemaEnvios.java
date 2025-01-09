import java.util.Scanner;

public class EjercicioSistemaEnvios {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Tarifas de envio fijas por kilo
        final var NACIONAL = 10;
        final var INTERNACIONAL = 20;

        //Titulo
        System.out.println("*** Sistema de Envios ***");

        //Toma de valores
        System.out.print("Ingresa el destino (Nacional/Internacional): ");
        var destino = consola.nextLine();
        var costoDestino = destino.equals("Nacional") ? NACIONAL : destino.equals("Internacional")? INTERNACIONAL : NACIONAL;

        System.out.print("Ingresa el peso del paquete (Kilogramos): ");
        var peso = Double.parseDouble(consola.nextLine());

        //Expresion costo de envio
        var envio = costoDestino * peso;

        //Imprecion
        System.out.printf("Costo del envio es: $%.2f", envio);

    }
}

import java.util.Scanner;

public class EjercicioSistemaReservaHotel {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final var COSTO_CON_VISTA_MAR = 190.50;
        final var COSTO_SIN_VISTA_MAR = 150.50;

        //INICIO DE ALGORITMO
        System.out.println("*** Sistema Reserva Hotel ***");

        //Cuestiones y captura de datos
        System.out.print("Ingrese su nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Ingrese dias a reservar: ");
        var diasReservados = Integer.parseInt(consola.nextLine());

        System.out.print("¿Vista al mar (si/no)?: ");
        var vistaMar = consola.nextLine();
        var conVistaMar = vistaMar.equalsIgnoreCase("si");

        //Operador ternadio
        var costoHospedaje = conVistaMar ? (COSTO_CON_VISTA_MAR * diasReservados) : (COSTO_SIN_VISTA_MAR * diasReservados);

        //Impresion de ticket
        System.out.printf("""
                \n*** Ticket Reservacion ***
                \n\tCliente : %s
                \tDias reservados : %d
                \tVista al mar : %s
                
                \tTotal : $%.2f
                """,nombreCliente, diasReservados, vistaMar, costoHospedaje);

    }
}

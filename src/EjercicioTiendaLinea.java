import java.util.Scanner;

public class EjercicioTiendaLinea {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final var MONTO_COMPRA_DESC = 1000;

        System.out.println("*** Tienda en Linea ***");

        System.out.print("¿Cuantos has comprado?: ");
        var compra = Double.parseDouble(consola.nextLine());

        System.out.print("¿Eres miembro de la tienda (si/no)?: ");
        var miembroTienda = consola.nextLine();

        //regresa true con equaIsIgnoreCase
        var miembro = miembroTienda.equalsIgnoreCase("Si");

        //Expresiones de calculo descuento
        var descuento10 = compra * 0.10;
        var descuento5 = compra * 0.05;


        //Expresions de totales
        var total10 = compra - descuento10;
        var total5 = compra - descuento5;

        //Algoritmo de condiciones
        if(compra >= MONTO_COMPRA_DESC && miembro){
            System.out.printf("""
                    \n*** Ticket de venta ***
                    \n\tCompra =  $%.2f
                    \tMiembro = %s
                    
                    \tDescuento(10%%) = $%.2f
                    \tTotal = $%.2f
                    """, compra, miembroTienda, descuento10, total10);
        } else if (compra >= MONTO_COMPRA_DESC || miembro) {
            System.out.printf("""
                    \n*** Ticket de venta ***
                    \n\tCompra =  $%.2f
                    \tMiembro = %s
                    
                    \tDescuento(5%%) = $%.2f
                    \tTotal = $%.2f
                    """, compra, miembroTienda, descuento5, total5);
        }else {

            System.out.printf("""
                    \n*** Ticket de venta ***
                    \n\tCompra =  $%.2f
                    \tMiembro = %s
                    
                    \tDescuento(0%%) = $0.00
                    \tTotal = $%.2f
                    """, compra, miembroTienda, compra);
        }


    }
}

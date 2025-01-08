import java.util.Scanner;

public class EjercicioAplicacionSaludFitness {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        System.out.println("*** Aplicacion de Salud y Fitness ***");

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa los pasos caminados en el dia: ");
        var pasosDia = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasosDia * CALORIAS_POR_PASO;

        if(pasosDia >= META_PASOS_DIARIOS){
            System.out.printf("""
                    \n*** Felicidades %s lograste la meta ****
                    
                    \tEl dia de hoy hiciste %d pasos y el rango minimo es de %d
                    \tQuemaste en total %.2f calorias
                    
                    BIEN HECHOO!!
                    """, nombre, pasosDia, META_PASOS_DIARIOS, caloriasQuemadas);
        }else {
            System.out.printf("""
                    \n*** Que lastima, no alcanzaste la meta %s :,(***
                    
                    \tEl dia de hoy hiciste %d pasos y el rango minimo es de %d
                    \tQuemaste en total %.2f calorias
                    
                    Suerte para la proxima!!
                    """, nombre, pasosDia, META_PASOS_DIARIOS, caloriasQuemadas);
        }


    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioSistemaAutenticacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        final var USUARIO = "Admin";
        final var PASSWORD = "admin123";

        //Titulo
        System.out.println("*** Sistema de Autenticacion ***");

        //Obtener valores
        System.out.print("Ingresa Usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingresa Contraseña: ");
        var password = consola.nextLine();

        //VALIDACION CON IF

        //if(usuario.equals(USUARIO) && password.equals(PASSWORD)){
        //    System.out.println("Bienvenido al Sistema");
        //}else if(usuario.equals(USUARIO) && !password.equals(PASSWORD)){
        //    System.out.println("Password invalido");
        //}else if(!usuario.equals(USUARIO) && password.equals(PASSWORD)){
        //    System.out.println("Usuario invalido");
        //}else {
        //    System.out.println("Usuario y contraseña incorrecotos");
        //}

        //VALIDACION EL SWITCH
        var mensajeAutenticacion = switch (usuario){
            case USUARIO -> {
                if(PASSWORD.equals(password))
                    yield "Bienvenido al sistema!";
                else
                    yield "Contraseña incorrecta, favor de corregirlo!";
            }
            default -> {
                if(PASSWORD.equals(password))
                    yield "Usuario incorrecto, favor de corregirlo";
                else
                    yield "Usuario y contraseña incorrectos, favor de corregirlos";

            }
        };
        System.out.println(mensajeAutenticacion);

    }
}

public class DiaSemanaMejorado {
    public static void main(String[] args) {
        //Titulo
        System.out.println("*** Dias de la Semana ***");

        //Valor a evaluar
        var dia = 3;

        //Validacion
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2  -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor ingresado incorrecto");

        }
    }
}

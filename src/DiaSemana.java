public class DiaSemana {
    public static void main(String[] args) {
        //Titulo
        System.out.println("*** Dias de la Semana ***");

        //Valor a evaluar
        var dia = 3;

        //Validacion
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2 :
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor ingresado incorrecto");
                break;

        }
    }
}
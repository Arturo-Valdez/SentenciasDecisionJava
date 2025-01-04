public class OperadorTernario {
    public static void main(String[] args) {
        //Sintaxis
        //condicion ? exp1 : exp2;

        //Determinar si un nuero es par o impar
        var numero = 4;
        var resultado = (numero % 2 == 0)? "Par": "impar";
        System.out.println("El numero " + numero + " es " + resultado);

        //Calcular si es mayor o menor de edad
        var edad = 17;
        var mensaje = (edad >= 18)?"Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes "+ edad + ", "+ mensaje);

        //Calcular si es positivo, negativo o cero (Operador ternario anidado)
        numero = 0;
        resultado = (numero > 0)? "Positivo":(numero < 0)? "Negativo" : "Cero";
        System.out.println("\nEl numero "+ numero + " es " + resultado);


    }

}

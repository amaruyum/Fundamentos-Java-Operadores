package operadores;

public class Operadores {

    public static void main(String[] args) {
        //Operadores Aritmeticos

        int a = 3, b = 2;
        var resultado = a + b; //Suma
        System.out.println("Resultado de ;a suma: " + resultado);

        resultado = a - b; //Resta
        System.out.println("Resultado de la resta: " + resultado);

        resultado = a * b; //Multiplicacion
        System.out.println("Resultado de la multiplicacion: = " + resultado);

        resultado = a / b; //Division de tipo entero
        System.out.println("resultado de la division: " + resultado);

        var resultado2 = 3.0 / b; //Division de tipo flotante
        System.out.println("resultado de la division: " + resultado2);

        resultado = a % b; //Modulo
        System.out.println("resultado del modulo: " + resultado);

        //Programa: Verificar si a es para o impar
        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

    }

}

package operadores;

public class OperadorTernario {

    public static void main(String args[]) {
        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        var resultado2 = (2 > 3) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado2);
        
        //Ejercicio: 
        var numero = 9;
        var resultado3 = (numero % 2 == 0) ? "Numero Par":"Numero Impar";
        System.out.println("resultado = " + resultado3);
    }
}

package operadores;

public class OperadoresCondicionales {

    public static void main(String args[]) {
        var a = -5;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = a >= 0 && a <= 10; //Operador Y
        
        if(resultado)
            System.out.println("Dentro del rango");
        else
            System.out.println("Fuera del rango");
        
        //Operador O
        var vacaciones = true;
        var diaDescanso = false;
        
        if(vacaciones|| diaDescanso)
            System.out.println("Padre puede asistir al juegoo");
        else
            System.out.println("El padre esta ocupado");
    }
}

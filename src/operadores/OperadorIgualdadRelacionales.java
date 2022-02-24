package operadores;

public class OperadorIgualdadRelacionales {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; //Compara refrencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); //Comparamos contenido de cadenas
        System.out.println("f = " + f);

        //Operadores Relacionales
        var g = a > b;
        System.out.println("g = " + g);

        var j = a >= b;
        System.out.println("j = " + j);
        
        //si un numero es par o impar
        if(a % 2 ==0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");
        //Si se considera adulto
        var edad = 30;
        var adulto = 18;
        if(edad >= adulto)
            System.out.println("Es adulto");
        else
            System.out.println("Es menor de edad");
    }

}

package operadores;

public class OperadoresUnarios {

    public static void main(String args[]) {
        //Operadores unariois
        //cambio de signo
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //negacion
        var c = true;
        var d = !c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Incremento
        //1. Preincremento (Simbolo antes de la variable)
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y despues se usa su valor

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. Postincremento (simbolo despues de la variable)    
        var g = 5;
        var h = g++;//Primero se utiliza el valor y despues se incrementa
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremento sigue la misma logica que el incremento
    }
}

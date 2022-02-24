package operadores;

public class OperadoresAsignacion {

    public static void main(String args[]) {
        //Operadores de asignacion
        int a1 = 3, b1 = 2;
        int c = a1 + 5 - b1; //Se lee de izquierda a derecha resultado = 6
        System.out.println("c = " + c);

        a1 += 1; // equivale a: a1 = a1 + 1;
        System.out.println("a1 = " + a1);

        a1 += 3; // equivale a: a1 = a1 + 3;
        System.out.println("a1 = " + a1);

        a1 -= 2; //equivalente a: a1 = a1 -2;
        System.out.println("a1 = " + a1);
    }
}

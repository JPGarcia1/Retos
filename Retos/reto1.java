import java.util.Scanner;

public class reto1 {
    public static void main(String[] args)
    {
        double F, C;
        Scanner number = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de grados Fahrenheit que quiere convertir a grados centígrados");
        F = number.nextDouble();
        C = (F-32)/1.8;

        System.out.println(F+"° Fahrenheit equivalen a: "+ C +"° centígrados");
        System.out.println("Fin del programa \n");
        number.close();
    }
}
import java.util.*;

public class reto5 {
    public static void main(String[] args) {
        int cantidad;
        double precio, total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("TIENDA PATRICIAMIGA\nIngrese la cantidad total de productos que va comprar");

        cantidad = sc.nextInt();
        for (int i = 1; i <= cantidad; i++)
        {
            System.out.println("Ingrese el precio del producto "+i+": ");
            precio = sc.nextDouble();

            total = total + precio;
        }        
        System.out.println("El valor total de los productos es: "+ total);
        sc.close();
    }
}
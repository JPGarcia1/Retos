import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        String[][] name = new String[4][4];
        int[][] price = new int[4][4];
        Scanner lector = new Scanner(System.in);

        System.out.println("Hola\nTienes que rellenar la maquina expendedora");

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < price.length; j++) {
                System.out.println("Digite el nombre del producto de la posicion: "+i+" - "+j);
                name[i][j] = lector.next();
                System.out.println("Digite el precio del producto de la posicion: "+i+" - "+j);
                price[i][j] = lector.nextInt();
            }
        }
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < price.length; j++) {
                System.out.print("( Codigo: "+(i+1)+""+(j+1)+". Producto: "+name[i][j] +". Precio: $"+price[i][j]+" )");
            }
            System.out.println("");
        }
        lector.close();
    }
}
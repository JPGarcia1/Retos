import java.util.*;

public class reto3
{
    public static void main(String []args){
        int moneda, opc;

        Scanner sc = new Scanner(System.in);

        Random tiro = new Random();

        moneda = tiro.nextInt(2);

        System.out.println("CARISELLAZO\nIndique el lado de la moneda al que va a apostar.");
        System.out.println(" 1. Cara.\n 2. Sello.");

        opc = sc.nextInt();

        switch (opc) {
            case 1:
            if (moneda==0)
            {System.out.print("El resultado es cara. Gano mera chiripa.");}
            else
            {System.out.println("El resultado es sello. Perdio.");}
                break;
            case 2:
            if (moneda==1)
            {System.out.print("El resultado es sello. Ganaste.");}
            else
            {System.out.println("El resultado es cara. Perdio.");}
                break;
            default:
            System.out.println("Digite una de las dos opciones.");
                break;
        }
        sc.close();
    }
}
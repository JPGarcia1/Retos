import java.util.*;

public class reto6 {
    public static void main(String[] args) {
        int cara = 0, sello = 1, moneda, opc, rondaGanada = 0, rondaPerdida = 0;
        double apuesta, total = 0;

        Scanner sc = new Scanner(System.in);

        Random tiro = new Random();
        
        System.out.println("CASA DE APUESTAS\nCARISELLAZO");
        do
        {
            System.out.println("\nIngrese la cantidad que va a apostar.");
            apuesta = sc.nextDouble();

            System.out.println("Indique el lado de la moneda al que va a apostar.");
            System.out.println(" 1. Cara.\n 2. Sello.\n 3. Terminar de apostar.");

            opc = sc.nextInt();
            
            moneda = tiro.nextInt(2);

            switch (opc) {
                case 1:
                if (cara==moneda)
                {
                    System.out.print("El resultado es cara. Ganaste.\n");
                    total = total + (apuesta*2);
                    rondaGanada = rondaGanada + 1;
                }
                else
                {
                    System.out.println("El resultado es sello. Perdio.\n");
                    total = total - apuesta;
                    rondaPerdida = rondaPerdida + 1;
                }
                    break;
                case 2:
                if (sello==moneda)
                {
                    System.out.print("El resultado es sello. Ganaste.\n");
                    total = total + (apuesta*2);
                    rondaGanada = rondaGanada + 1;
                }
                else
                {
                    System.out.println("El resultado es cara. Perdio.\n");
                    total = total - apuesta;
                    rondaPerdida = rondaPerdida + 1;
                }
                    break;
                case 3:
                    System.out.println("Saliendo de la casa de apuestas");
                    break;
                default:
                System.out.println("Digite una de las tres opciones.");
                    break;
            }
        }
        while(opc!=3);

        System.out.println("El total ganado es "+total+". El total de rondas ganadas es "+rondaGanada+". El total de rondas perdidas es: "+rondaPerdida+".");

        sc.close();
    }
}
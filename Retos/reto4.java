import java.util.*;

public class reto4 {
    public static void main(String[] args) {
        int jugador, maquina, opc;

        Scanner sc = new Scanner(System.in);

        Random movimiento = new Random();

        maquina = movimiento.nextInt(3);

        System.out.println("PIEDRA, PAPEL O TIJERA\nEscoja el movimiento que va a hacer.");
        System.out.println(" 1. Piedra\n 2. Papel\n 3. Tijera");

        opc = sc.nextInt();

        /* 0 es piedra
         * 1 es papel
         * 2 es tijera */

        switch (opc) {
            case 1:
            jugador = 0;
                if (jugador == 0 && maquina == 0)
                {
                    System.out.println("Jugador: Piedra - Maquina: Piedra\nEmpate");
                }
                else if (jugador == 0 && maquina == 1)
                {
                    System.out.println("Jugador: Piedra - Maquina: Papel\nPerdiste");
                }
                else
                {
                    System.out.println("Jugador: Piedra - Maquina: Tijera\nGanaste");
                }
                break;
            case 2:
            jugador = 1;
                if (jugador == 1 && maquina == 1)
                {
                    System.out.println("Jugador: Papel - Maquina: Papel\nEmpate");
                }
                else if (jugador == 1 && maquina == 2)
                {
                    System.out.println("Jugador: Papel - Maquina: Tijera\nPerdiste");
                }
                else
                {   
                    System.out.println("Jugador: Papel - Maquina: Piedra\nGanaste");
                }
                break;
            case 3:
            jugador = 2;
                if (jugador == 2 && maquina == 2)
                {
                    System.out.println("Jugador: Tijera - Maquina: Tijera\nEmpate");
                }
                else if (jugador == 2 && maquina == 0)
                {
                    System.out.println("Jugador: Tijera - Maquina: piedra\nPerdiste");
                }
                else
                {
                    System.out.println("Jugador: Tijera - Maquina: Papel\nGanaste");
                }
                break;
            default:
            System.out.println("Por favor digite una de las tres opciones");
                break;
        }
        sc.close();
    }
}
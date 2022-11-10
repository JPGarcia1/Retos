import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        int cantNotas;
        double[] valorNotas;
        double promedio, valorTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al evaluador de notas \nPor favor ingrese la cantidad de notas que va a ingresar: ");
        cantNotas = sc.nextInt();
        valorNotas = new double [cantNotas];

        for (int i = 0; i < valorNotas.length; i++) {
            System.out.println("Ingrese la nota número = "+(i+1));
            valorNotas[i] = sc.nextDouble();
            valorTotal = valorTotal + valorNotas[i];
        }
        promedio = valorTotal / cantNotas;

        if(promedio < 3)
        {
            System.out.println("El promedio total es = "+promedio+"\nReprobaste.");
        }
        else if(promedio < 4 && promedio >= 3)
        {
            System.out.println("El promedio total es = "+promedio+"\nPasaste Raspando.");
        }
        else
        {
            System.out.println("El promedio total es = "+promedio+"\nAprobaste con buenos resultados.");
        }
        sc.close();
    }
}
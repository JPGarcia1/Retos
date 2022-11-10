import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        String[] name;
        double[] time;
        int cantComp=0, determinarMenorTiempo = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenido a la competencia de natación\nPor favor ingrese la cantidad de nadadores que van a competir");
        cantComp = lector.nextInt();
        name = new String[cantComp];
        time = new double[cantComp];
        for (int i = 0; i < time.length; i++) {
            System.out.println("Digite el nombre del nadador"+(i+1));
            name[i] = lector.nextLine();
            System.out.println("Digite el tiempo del nadador "+name[i]+" en segundos");
            time[i] = lector.nextInt();
            if(time[i]<time[determinarMenorTiempo])
            {
                determinarMenorTiempo = i;
            }
        }
        System.out.println("RESULTADOS\n");
        for (int i = 0; i < time.length; i++) 
        {
            System.out.println("Nadador: "+name[i]+ " - Tiempo: " +time[i]);
        }               
        System.out.println("El GANADOR es: "+name[determinarMenorTiempo]+" con un TIEMPO de: "+ name[determinarMenorTiempo]);
        lector.close();
    }
}
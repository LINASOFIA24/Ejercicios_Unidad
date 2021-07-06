//Realizado por Lina Sofia Centeno G72

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int horas_Lab;

        System.out.println("---Sueldo de trabajador----");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println();

        System.out.println("Ingrese numero de horas laboradas: ");
        horas_Lab = sc.nextInt();
        System.out.println();

        System.out.println("El trabajador " +nombre+ " trabajó "+horas_Lab+ " horas y su sueldo es de: $"+(30000*horas_Lab));
        sc.close();

    }
        

    
}

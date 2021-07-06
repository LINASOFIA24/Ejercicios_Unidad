//Realizado por Lina Sofia Centeno G72
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;

        System.out.println("---Salario----");
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println();

        System.out.print("Ingrese su salario: ");
        salario = sc.nextInt();
        System.out.println();


        if (edad< 16){
            System.out.print("No tiene edad para trabajar ");
        }
        
        else if (edad<=50 && edad>=19){
             System.out.print("Su salario es $" +(salario+salario*0.05) );
        }

        else if (edad <= 60 && edad >=51){
             System.out.print("Su salario es $" +(salario+salario*0.1));
        }

        else if (edad > 60){
            System.out.print("Su salario es $" + (salario +salario*0.15));
        }

        sc.close();





    }
}
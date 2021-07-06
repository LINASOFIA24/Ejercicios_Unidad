//Realizado por Lina Sofia Centeno G72
import java.util.*;
public class ejercicio_1 {


    public static void main(String[] args) {

        float numero_1;
        float numero_2;
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--Operaciones aritmeticas--");
        System.out.print("Introduce un numero: ");
        numero_1 = sc.nextInt();
        System.out.println();
    

        System.out.print("Introduce un segundo numero: ");
        numero_2 = sc.nextInt();
        System.out.println();

        

        System.out.println("la Suma de " + (int) numero_1+ " y " +  (int)numero_2+" es igual a " +((int)numero_1 + (int)numero_2));
        System.out.println("la Resta de " +(int)numero_1+ " y " + (int)numero_2+" es igual a " +((int)numero_1 - (int)numero_2));
        System.out.println("la Multiplicación de " +(int)numero_1+ " y " + (int)numero_2+" es igual a " +((int)numero_1 * (int)numero_2));
        System.out.println("la División de " +(int)numero_1+ " y " + (int)numero_2+" es igual a " +((float)numero_1 / (float)numero_2));

        sc.close();
        


    }
    

   
}

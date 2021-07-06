//Realizado por Lina Sofia Centeno G72

import java.util.Random;
import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String arg[ ]) {
        Random rnd = new Random();

        System.out.println("Adivina el numero");
        int ran = rnd.nextInt(100);
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero_usua = sc.nextInt();
        

        for (;;){
            
            if(numero_usua ==ran) {
                System.out.println("¡Felicidades, has acertado!");
              break;
            }
              
            else if (ran < numero_usua) {
              System.out.println("El numero que busca es menor");
              numero_usua = sc.nextInt(); }
              
              
            if  (ran > numero_usua){
              System.out.println("El numero que busca es mayor");
              numero_usua = sc.nextInt(); }
        


        }
        

       

        
    }
}



//Realizado por Lina Sofia Centeno G72
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        String Nuevo;
        do {
            System.out.println("---Numeros----");
            System.out.print("Por favor, ingrese un numero: ");
            numero = sc.nextInt();
        

            int contador = 0;

            if (numero == 0 || numero == 1) {
				contador = 1;
			} else if (numero == 2) {
				contador = 0;
			}


         
           for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                   contador ++;
                }
           }

           if (contador<=2){
                    System.out.println("El numero es primo ");

            } else {
                    System.out.println("El  numero no es primo");
            }

        
        
           do { 
               System.out.print("¿Desea ingresar un nuevo numero?" );
               Nuevo = sc.nextLine();

               
            } while (!Nuevo.equalsIgnoreCase("S") && !Nuevo.equalsIgnoreCase("N"));
            
            if (Nuevo.equals("N")) {
                break;
            }
            
        } while (Nuevo.equalsIgnoreCase("S"));
        
        System.out.print("Gracias... ");
        

        sc.close();
       

        


        
        

        

    }
    
}

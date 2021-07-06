import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("---Serie Fibonacci----");
        System.out.println("Por favor, ingrese un numero: ");
        numero = sc.nextInt();
        System.out.println();

        long num1 = 0;
        long num2 = 1;
        long num3 =1;

        System.out.print(num1);
        System.out.print(", " +num2);

        for (int i=0;i <= numero;i++) {

            if (num1 + num2 <= numero){
            
               num3 = num1 + num2;
            
               num1= num2;
            
               num2 = num3;
               System.out.print(", " +num3);
            }
        }
               
         
            System.out.print(". Fin");
               

       

        

            
    
    }
             
    
}

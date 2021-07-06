import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("---Tablas de multiplicar----");
        System.out.println("Por favor, ingrese un numero: ");
        numero = sc.nextInt();
        System.out.println();


        for (int i=0;  i<=10; i++){
            System.out.println(numero+" x "+i+" = "+(i*numero));

        }
        
        sc.close();

    }




    
}

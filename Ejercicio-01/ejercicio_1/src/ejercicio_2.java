import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    

        String nombre;
        Float nota_1;
        Float nota_2;
        Float nota_3;

        
        System.out.println("---Promedio de notas----");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println();

        System.out.println("Ingrese nota de evalucion 1: ");
        nota_1 = sc.nextFloat();
        System.out.println();

        System.out.println("Ingrese nota de evaluacíon 2: ");
        nota_2 = sc.nextFloat();
        System.out.println();

        System.out.println("Ingrese nota de evaluacíon 3: ");
        nota_3 = sc.nextFloat();
        System.out.println();

        Float promedio = (nota_1 + nota_2 + nota_3)/3;

        if(promedio>=3)
        System.out.println("Aprobado");

        else
         System.out.println("Reprobado");


         sc.close();




    }
    
}

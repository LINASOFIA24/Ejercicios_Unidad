import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sexo;
        int altura;
        System.out.println("---Descubre tu peso ideal----");
        System.out.print("Ingrese su sexo (H, si es masculino y M, si es femenino): ");
        sexo = sc.nextLine();
        System.out.println();

        System.out.print("Ingrese su altura en cm: ");
        altura = sc.nextInt();
        System.out.println();

        if(sexo.equalsIgnoreCase("M"))
           System.out.print("Su peso ideal es: " +(altura-120)+"Kg");

        else if (sexo.equalsIgnoreCase("H"))
           System.out.print("Su peso ideal es: " +(altura-110) +"Kg");

        if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M"))
           System.out.print("Por favor ingrese un valor valido");

        

        sc.close();
    }
        

    
}

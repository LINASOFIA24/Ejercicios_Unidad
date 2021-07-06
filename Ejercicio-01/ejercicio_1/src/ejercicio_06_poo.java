import java.util.Scanner;

public class ejercicio_06_poo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Tablas de multiplicar --\n");

        tablas tablas_1 = new tablas();

        System.out.print("Introduce un numero: ");
        int numero_1 = sc.nextInt();
    
        System.out.print(tablas_1.operacion());

    sc.close();

}


class tablas{
    private int numero_1;
    private int operacion;
    private int i;

    public tablas(){
        numero_1 = 1;
        
    }

    public void numeros(int numero_1, int numero_2) {
        this.numero_1 = numero_1;
       

    }


    public String operacion(){
        for (int i=0;  i<=10; i++){
            operacion = i*numero_1;

        }
        return i+ " x " + numero_1+ " = = " +operacion;
    }

    

    }




}

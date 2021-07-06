//Realizado por Lina Sofia Centeno G72
import java.util.Scanner;

public class Ejercicio_01_obj {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    
        System.out.println("---Promedio de notas----");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println();

        estudiante estudiante_1 = new estudiante(nombre);

        System.out.print("Introduce Nota 1: ");
        float nota_1 = sc.nextFloat();
        System.out.print("Introduce Nota 2: ");
        float nota_2 = sc.nextFloat();
        System.out.print("Introduce Nota 3: ");
        float nota_3 = sc.nextFloat();

        estudiante_1.notas(nota_1, nota_2, nota_3);

        System.out.print(estudiante_1.promediof());
        System.out.print(estudiante_1.notaprom());




    }
    
}



class estudiante{
    private String nombre;
    private float nota_1;
    private float nota_2;
    private float nota_3;
    private float promedio;


    public estudiante(String nombre){
        this.nombre = nombre;
        
    }

    public void notas(float nota_1, float nota_2, float nota_3) {

        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
    }
    public String promediof(){ 
        promedio = (nota_1 + nota_2 + nota_3) / 3;
        if (promedio >= 3) { 
			return "\nEl alumno " + nombre + " aprobó con un promedio de: ";
				
		} else {
			return "\nEl alumno " + nombre + " fue Reprobó con un promedio de: ";
				
		}
    }
        
    

    public float notaprom() {
        return promedio;
    }






}
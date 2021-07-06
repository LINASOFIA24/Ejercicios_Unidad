import java.util.Scanner;
 
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jugador_1;
        String jugador_2;
        String nuevo;

        
        System.out.print("Piedra, Papel o Tijera \n");
        System.out.print("Intrucciones de juego: \n");
        System.out.print("Introduce  P para piedra, L para papel y T para tijera \n");
        System.out.println("Numero de Jugadores: 2 \n");
        System.out.print("Inicio de Juego \n");
        System.out.print("Preparado...\n");

        do{ 
        
             System.out.print("jugador 1: \n");
             System.out.print("Piedra, Papel o Tijera: ");
             jugador_1 = sc.nextLine();

             System.out.print("jugador 2: \n");
             System.out.print("Piedra, Papel o Tijera: ");
             jugador_2 = sc.nextLine();

            if (jugador_1.equalsIgnoreCase("P") && jugador_2.equalsIgnoreCase("P"))
                 System.out.print("Empate \n");

            else if (jugador_1.equalsIgnoreCase("P") && jugador_2.equalsIgnoreCase("L"))
                    System.out.print("Ganó Jugador 2 \n");

            else if (jugador_1.equalsIgnoreCase("P") && jugador_2.equalsIgnoreCase("T"))
                     System.out.print("Ganó Jugador 1 \n");

            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("L"))
                 System.out.print("Empate \n");

            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("p"))
                 System.out.print("Ganó jugador 1 \n");

            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("T"))
                 System.out.print("Ganó Juagdor 2 \n");

            else if (jugador_1.equalsIgnoreCase("T") && jugador_2.equalsIgnoreCase("T"))
                 System.out.print("Empate \n");

            else if (jugador_1.equalsIgnoreCase("T") && jugador_2.equalsIgnoreCase("P"))
                 System.out.print("Ganó Juagdor 2 \n");

            else if (jugador_1.equalsIgnoreCase("T") && jugador_2.equalsIgnoreCase("L"))
                 System.out.print("Ganó Juagdor 1 \n");

            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("P"))
                 System.out.print("Ganó Juagdor 1 \n");

            else if (jugador_1.equalsIgnoreCase("T") && jugador_2.equalsIgnoreCase("P"))
                 System.out.print("Ganó Juagdor 2 \n");

            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("T"))
                 System.out.print("Ganó Juagdor 2 \n");

            else if (jugador_1.equalsIgnoreCase("P") && jugador_2.equalsIgnoreCase("L"))
                 System.out.print("Ganó Juagdor 2");
        
            else if (jugador_1.equalsIgnoreCase("L") && jugador_2.equalsIgnoreCase("T"))
                 System.out.print("Ganó Juagdor 2 \n");


            do{
                System.out.print("¿Desea jugar nuevamente? (S/N): ");
                nuevo = sc.nextLine();

            } while(!nuevo.equalsIgnoreCase("S") && !nuevo.equalsIgnoreCase("N"));



        } while(nuevo.equalsIgnoreCase("S"));

        System.out.print("Gracias por jugar!");
        sc.close();









         





        //numero = obtenerNumero.nextInt();
 
    
        
    }
}

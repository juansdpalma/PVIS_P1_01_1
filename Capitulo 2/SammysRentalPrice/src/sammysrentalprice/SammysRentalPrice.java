
package sammysrentalprice;
import java.util.Scanner;

public class SammysRentalPrice {

 
    public static void main(String[] args) {
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss                                                  Ss");
        System.out.println("Ss       “Sammy’s makes it fun in the sun”          Ss");
        System.out.println("Ss                                                  Ss");
        System.out.println("Ss    Precio por hora: $40    Minutos plus:  $1     Ss");
        System.out.println("Ss                                                  Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Hola, ¿Por cuánto tiempo rentaste tu equipo?  ");
        int horas;
        int minutos;
        System.out.println("Horas:  ");
        Scanner entrada = new Scanner(System.in);
        horas = entrada.nextInt();
        System.out.println("Minutos");
        minutos = entrada.nextInt();
        int ph;
        int pm;
        ph= horas*40;
        pm=minutos*1;
        int total=ph+pm;
        System.out.println("El cargo de la renta de tu equipo es de:  ");
        System.out.println("$"+total+"Dolares");                

        
    }
    
}

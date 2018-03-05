
package eggs;
import java.util.Scanner;

public class Eggs {

    
    public static void main(String[] args) {
        System.out.println("¿Cuántos huevos vas a querer?");
        Scanner teclado= new Scanner(System.in);
        int huevos=teclado.nextInt();
        int contador=0;
        int modulo= huevos %12;
        while (huevos>=12){
            contador++;
            huevos=huevos-12;
        }
        System.out.println(contador+" Docena(s) "+modulo+" sueltos");
        double precio_docena=3.25;
        double precio_suelto=0.45;
        double pd=contador*precio_docena;
        double ps=modulo*precio_suelto;
        System.out.println(ps+pd+" dolares");
        
        
    }
    
}

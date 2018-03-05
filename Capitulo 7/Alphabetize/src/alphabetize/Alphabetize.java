
package alphabetize;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Alphabetize {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra:  ");
        String primera = teclado.next();
        System.out.println("Ingrese otra palabra:  ");
        String segunda = teclado.next();
        System.out.println("Ingrese otra palabra:  ");
        String tercera = teclado.next();
        ArrayList ordenar = new ArrayList<>();
        ordenar.add(primera);
        ordenar.add(segunda);
        ordenar.add(tercera);
        Collections.sort(ordenar);
        ordenar.forEach((Ordenados)->{System.out.println(Ordenados);});
            
        
   
    }
    
}

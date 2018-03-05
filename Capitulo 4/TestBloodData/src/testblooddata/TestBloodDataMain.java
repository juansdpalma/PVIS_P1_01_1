
package testblooddata;

import java.util.Scanner;

public class TestBloodDataMain {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("INTRODUZCA EL TIPO DE SANGRE ");
        String tip=teclado.next();
        System.out.println("INTRODUZCA factor: ");
        String fact=teclado.next();
        TestBloodData b = new TestBloodData(tip,fact);
        System.out.println(b); 
    }
    
}

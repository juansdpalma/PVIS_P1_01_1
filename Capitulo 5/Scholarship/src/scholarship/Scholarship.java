
package scholarship;

import java.util.Scanner;

public class Scholarship {

    public static void main(String[]args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Indique el promedio del estudiante: ");
       double p = teclado.nextDouble();
       System.out.println("Cuántas actividades extracurriculares realizó: ");
       int a = teclado.nextInt();
       System.out.println("Actividades de servicio: ");
       int s = teclado.nextInt();
       if((p >= 3.8)&&(a >= 1)&&(s >= 1)){
           System.out.println("Scholarship candidate");
       }else if((p < 3.8)&&(p > 3.4)&&(a >= 3)&&(s >= 3)){
           System.out.println("Scholarship candidate");
       }else if((p < 3.4)&&(p > 3.0)&&(a >= 2)&&(s >= 3)){
           System.out.println("Scholarship candidate");
       }else{
           System.out.println("Not a candidate");
       }
   } 
}
    



package sumintegersinstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumIntegersInString {
    public static void main(String[] args) {
        System.out.println("Ingrese numeros separados por un enter y ingrese 0(cero) para salir:  ");
        Scanner teclado = new Scanner(System.in);
        List<Integer> lista=new ArrayList<Integer>();
        int i =0;
        do{
            
        
                      
            i=teclado.nextInt();
            lista.add(i);
        }
        while(i!=0);
        while(lista.size()!=0){
                int actual = lista.remove(0);
                int j =0;
                while(j<lista.size()){
                    int otro= lista.remove(1);
                    int sumas= actual+otro;
                    System.out.println(" La suma de todos los numeros:  "+sumas);
                j++;
                }
          
            
        }
       
        }
        }
        
        
       
    


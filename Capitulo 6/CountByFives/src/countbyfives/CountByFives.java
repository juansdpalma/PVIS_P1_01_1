/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyfives;

/**
 *
 * @author JUAN PALMA
 */
public class CountByFives {
     public static void main(String[]args){
        int n = 0;
        
        while(n <= 195){
            n = n + 5;
            System.out.println(n);
            if(n % 50 == 0){
                System.out.printf("\n %d",n);
            }
        }
    }
}

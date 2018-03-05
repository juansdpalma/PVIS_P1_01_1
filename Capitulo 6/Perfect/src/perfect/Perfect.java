
package perfect;

import java.util.Scanner;

public class Perfect {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int sum = 0;
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if (sum == num) {
	   System.out.format("%d is a Perfect Number", sum);
	}else {
	   System.out.format("%d is NOT a Perfect Number", num);
	}
    }
    
}


package fahrenheittocelsius;

import java.util.Scanner;


public class FahrenheittoCelsius {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Cuantos Fahrenheit?");
        double fahrenheit;
        fahrenheit= teclado.nextDouble();
        double celsius= (fahrenheit-32)*0.55555556;
      
        System.out.println(celsius);
    }
    
}

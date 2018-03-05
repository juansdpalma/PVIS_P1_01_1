
package dogboarding;

import java.util.Scanner;


public class DogBoarding {

    public static void main(String[] args) {
        System.out.println("Bienvenido con el cuidador de perros... \n"+" ¿Cuántos kilogramos pesa tu perro?");
        Scanner teclado= new Scanner(System.in);
        double peso = teclado.nextDouble();
        System.out.println("¿Cuántas horas cuidaremos a tu perro?");
        double tiempo= teclado.nextDouble();
        System.out.println("El costo por hora será de 50 centavos");
        double costo = 0.50;
        double operacion= (tiempo*peso)*(costo);
        System.out.println(operacion+" dolares");
       
    }
    
}

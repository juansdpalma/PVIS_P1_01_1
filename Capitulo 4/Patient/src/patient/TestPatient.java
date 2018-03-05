
package patient;

import java.util.Scanner;

public class TestPatient {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce id: ");
        String ide=teclado.next();
        System.out.println("Indroduzca edad: ");
        Integer edd=teclado.nextInt();
        System.out.println("tipo de sangre; ");
        String ts=teclado.next();
        Patient p = new Patient(ide,ts,edd);
        System.out.println(p);
    
}
}


package proyectsalesinteractive;
import java.util.Scanner;

public class ProyectSalesInteractive {


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("¿Cuáles son las ganancias de norte?");
        float norte = teclado.nextFloat();
        System.out.println("¿Cuáles son las ganancias de sur?");
        float sur =teclado.nextFloat();
        float surde= sur/10;
        float surd= surde+sur;
        float norde= norte/10;
        float nord=norte+norde;
        System.out.println("Las ganancias de norte son : "+norte+ "  dolares");
        System.out.println("Las ganancias aumentadas 10% de norte son : "+nord+ "  dolares");
        System.out.println("Las ganancias de sur son : "+sur+" dolares");
        System.out.println("Las ganancias de sur aumentadas 10% "+surd+"  dolares");
        
    }
    
}

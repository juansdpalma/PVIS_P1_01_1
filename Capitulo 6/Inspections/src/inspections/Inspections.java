
package inspections;


public class Inspections {

   public static void main(String[]args){
        int fabrica = 0;
        double porcentaje = 0, porcentaje2 = 0, porcentaje3 = 0, porcentaje4 = 0;
        int aux1 = 0;
        int aux2 = 0;
        int r = 0, r2 = 0, r3 = 0, r4 = 0;
        for (int i = 0; i < 52; i++) {
            fabrica = (int)(Math.random() * 4) + 1;
            System.out.println("La fabrica es: " + fabrica);
            if(fabrica == 1){
                aux2 = aux2 + fabrica; 
                r = aux2 / 1;
            }else if(fabrica == 2){
                aux2 = aux2 + fabrica;
                r2 = aux2 / 2;
            }else if(fabrica == 3){
                aux2 = aux2 + fabrica;
                r3 = aux2 / 3;
            }else if(fabrica == 4){
                aux2 = aux2 + fabrica;
                r4 = aux2 / 4;
            }
        }
        porcentaje = (r * 100) / 52;
        porcentaje2 = (r2 * 100) / 52;
        porcentaje3 = (r3 * 100) / 52;
        porcentaje4 = (r4 * 100) / 52;
        System.out.println("El porcentaje de rivision anual de lafabrica 1 es de " + porcentaje);
        System.out.println("El porcentaje de rivision anual de lafabrica 2 es de " + porcentaje2);
        System.out.println("El porcentaje de rivision anual de lafabrica 3 es de " + porcentaje3);
        System.out.println("El porcentaje de rivision anual de lafabrica 4 es de " + porcentaje4);
    }
}

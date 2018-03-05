
package population;


public class Population {

    public static void main(String[]args){
        double ppm = 0;
        double ppeu = 0;
        double pm = 114000000.0;
        double peu = 312000000.0;
        double ptm = 0;
        double pteu = 0;
        int i = 1;
        int aux = 0;
        ppm = (1.01 * 114) / 100;
        ppeu = (0.15 * 312) / 100;
        
        while(pm <= peu){
            pm = pm + ppm;
            peu = peu - ppeu;
            aux = aux + i;
            i++;
        }
        System.out.println("El tiempo es: " + aux);
    }
}

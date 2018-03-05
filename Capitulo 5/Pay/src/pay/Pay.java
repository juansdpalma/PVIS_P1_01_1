
package pay;

import java.util.Scanner;


public class Pay {
    public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      System.out.println("SKILL LEVEL     HOURLY PAY RATE($)");
      System.out.println("     1                17.00");
      System.out.println("     2                20.00");
      System.out.println("     3                22.00");
      int pt = 0;//pago total
      int pte = 0;//pago extra
      int pte2 = 0;
      int pc = 0;//pago de cuarenta horas 
      int pt3 = 0;//el pago normal + horas extra
      double opr = 0;
      int r = 0;
      double gp = 0;
      System.out.println("Escoge tu nivel: ");
      int ni = teclado.nextInt();//nivel
      System.out.println("Introduce las horas trabajadas en la semana: ");
      int h = teclado.nextInt();//horas trabajadas
      System.out.println("Horas extras trabajadas: ");
      int he = teclado.nextInt();//horas extra
      if(ni == 1){
          System.out.println("Horas trabajadas: " + h);
          pt = h * 17;
          System.out.println("El pago total: " + pt);
          pc = h * 40;
          System.out.println("Pago de 40 horas: " + pc);
          pte = he * 17; 
          pte2 = (150 * pte) / 100;
          System.out.println("El pago extra es de: " + pte2);
          pt3 = pte2 + pt;
          System.out.println("El pago normal más el pago extra es de: " + pt3);
          
      }else if(ni == 2){
          System.out.println("Option     Explanation Weekly     Cost to Employee ($)");
          System.out.println("1          Medical insurance            32.50");
          System.out.println("2          Dental insurance             20.00");
          System.out.println("3      Long-termdisabilityinsurance     10.00");
          System.out.println("Elija una opción: ");
          int opcion = teclado.nextInt();
          if (opcion == 1){
             opr = 32.5;
          }else if(opcion == 2){
              opr = 20.0;
          }else if(opcion == 3){
              opr = 10.0;
          }
          System.out.println("Horas trabajadas: " + h);
          pt = h * 17;
          System.out.println("El pago total: " + pt);
          pc = h * 40;
          System.out.println("Pago de 40 horas: " + pc);
          pte = he * 17; 
          pte2 = (150 * pte) / 100;
          System.out.println("El pago extra es de: " + pte2);
          pt3 = pte2 + pt;
          System.out.println("El pago normal más el pago extra es de: " + pt3);
          r = pt + pc + pte2 + pt3;
          opr = opr + r;
          System.out.println("El total de todo es: " + opr);
      }else if(ni == 3){
          System.out.println("Option     Explanation Weekly     Cost to Employee ($)");
          System.out.println("1          Medical insurance            32.50");
          System.out.println("2          Dental insurance             20.00");
          System.out.println("3      Long-termdisabilityinsurance     10.00");
          System.out.println("Elija una opción: ");
          int opcion = teclado.nextInt();
          if (opcion == 1){
             opr = 32.5;
          }else if(opcion == 2){
              opr = 20.0;
          }else if(opcion == 3){
              opr = 10.0;
          }
          System.out.println("Horas trabajadas: " + h);
          pt = h * 17;
          System.out.println("El pago total: " + pt);
          pc = h * 40;
          System.out.println("Pago de 40 horas: " + pc);
          pte = he * 17; 
          pte2 = (150 * pte) / 100;
          System.out.println("El pago extra es de: " + pte2);
          pt3 = pte2 + pt;
          System.out.println("El pago normal más el pago extra es de: " + pt3);
          
          r = pt + pc + pte2 + pt3;
          opr = opr + r;
          System.out.println("El total de todo es: " + opr);
          gp = (3 * opr) / 100;
          System.out.println("El gross pay es de: " + gp);
      }
  }  
}



    


package bread;

public class TestBread {
    public static void main (String[]args){
    Bread b1 = new Bread(" Cuernito ",123);
    Bread b2 = new Bread(" Concha ",20);
    Bread b3 = new Bread(" Churro ",230);
    display(b1);
    display(b2);
    display(b3);
    }
    public static void display(Bread b){
        System.out.println("el pan "+b.getPan()+"tiene "+b.getCalorias()+" calorias");
        System.out.println("El pan MOTTO es "+b.MOTTO);
    
    }
    
    
}

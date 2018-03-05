
package sandwichfilling;

public class TestSandwichFelling {
    public static void main(String[]args){
        SandwichFilling sf1= new SandwichFilling (" Quesillo ",330);
        SandwichFilling sf2= new SandwichFilling (" Chile relleno ",240);
        SandwichFilling sf3= new SandwichFilling (" Jamon",230);
        display(sf1);
        display(sf2);
        display(sf3);
    }

    private static void display(SandwichFilling s) {
        System.out.println("El sandwich de "+s.getFilling()+" tiene "+s.getCalorias()+" calorias");
    }
}
    


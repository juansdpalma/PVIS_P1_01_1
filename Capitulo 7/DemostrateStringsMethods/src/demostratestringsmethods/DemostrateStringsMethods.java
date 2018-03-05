
package demostratestringsmethods;

public class DemostrateStringsMethods {


    public static void main(String[] args) {
        
        String quote = "You can never cross the ocean until you have the courage to lose sight of the shore";
        quote.indexOf('v');
        quote.indexOf('x');
        quote.charAt(16);
        quote.endsWith("bus");
        quote.endsWith("car");
        quote.replace('c', 'C');
        System.out.println(quote);
    }

    
    
}

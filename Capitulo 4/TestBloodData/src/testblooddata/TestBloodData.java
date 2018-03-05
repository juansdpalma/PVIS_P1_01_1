
package testblooddata;

public class TestBloodData {
    private String tipo1;
    private String tipo2;
    private String tipo3;
    private String tipo4;
    private String factor1;
    private String factor2;
    private String sangre;
    private String tipo;
    /*public BloodData(String t1, String t2, String t3, String t4, String f1, String f2){
        this.factor1="+";
        this.factor2="-";
        this.tipo1="O";
        this.tipo2="A";
        this.tipo3="B";
        this.tipo4="AB";
    }*/ 
     
    public  TestBloodData(String s, String t){
        this.sangre = s;
        this.tipo = t;
        
    }
   
    
    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public String getTipo4() {
        return tipo4;
    }

    public void setTipo4(String tipo4) {
        this.tipo4 = tipo4;
    }

    public String getFactor1() {
        return factor1;
    }

    public void setFactor1(String factor1) {
        this.factor1 = factor1;
    }

    public String getFactor2() {
        return factor2;
    }

    public void setFactor2(String factor2) {
        this.factor2 = factor2;
    }
    public String toString(){
        return "tu tipo de sangre es: "+ sangre + tipo;
    }
}
   
    


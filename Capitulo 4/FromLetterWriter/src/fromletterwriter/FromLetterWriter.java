package fromletterwriter;
public class FromLetterWriter {
    private String nombre;
    private String apellido;
       public   FromLetterWriter (String a ){
        this.apellido=a;
}

         public  FromLetterWriter (String n, String a ){
        this.nombre=n;
        this.apellido=a;
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apellido;
    }

    public void setApelldo(String apelldo) {
        this.apellido = apelldo;
    }
   public String toString(){
       
  
       
       return "Estimado " + nombre+" "+apellido+"\nGracias por su orden";
   }
   }


package colegio;


public class Estudiante extends Rector{
    private String apellido;
   
    private boolean estaEnBachillerato;
    
    public Estudiante (String nombre, 
             String bilingue, 
             String apellido, 
            
             boolean estaEnBachillerato){
        
        super( nombre, bilingue);
        this.apellido = apellido;
        
        this.estaEnBachillerato = estaEnBachillerato;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstaEnBachillerato() {
        return estaEnBachillerato;
    }

    public void setEstaEnBachillerato(boolean estaEnBachillerato) {
        this.estaEnBachillerato = estaEnBachillerato;
    }

     
}

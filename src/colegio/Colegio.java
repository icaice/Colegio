package colegio;

import java.util.Date;

public class Colegio {

    private String nombre;// nombre del colegio
    private int numeroDeProfesores;//cantidad de profesores que trabajan en el colegio
    private Date fechaDeFundacion; //fecha en la que se fundo el colegio
    private int numeroDeSalones;//numero de salones que hay en el colegio
    private Boolean nacional; //si es conocidad en colombia     
    

   
    //Atributos de Composición
    private Rector propietario = null;
    private Estudiante persona;
    
    
    //este es el constructor de clases
    public Colegio(String nombre,
            int numeroDeProfesores,
            Date fechaDeFundacion,
            int numeroDeSalones,
            Boolean nacional,
            String nombreRector
    
    ) {
        this.nombre = nombre;
        this.numeroDeProfesores = numeroDeProfesores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.numeroDeSalones = numeroDeSalones;
        this.nacional = nacional;
        this.persona = new Estudiante("carlos", true);
    }

    

    

    //nuevos atributos get y set
    
    public Rector getPropietario(){
        return this.propietario;
    }

    public void setPropietario(Rector r){
        this.propietario = r;
    }
    
    public Estudiante getPersona() {
        return persona;
    }

    public void setEstudiante(Estudiante persona) {
        this.persona = persona;
    }

    
    
    //aumenta la cantidad de salones en 20 y aumenta el numero de profesores en 15
    public void hacerMasSalones() {
        this.numeroDeSalones += 9;
        this.numeroDeProfesores += 2;
    }

    /**
     * Este metodo permite cambiar el nombre del colegio y sea conocido
     * nacionalmente
     */
    public void reconocerNacionalmente(String nuevoNombre) {
        this.nombre = nuevoNombre;
        this.nacional = true;
    }

    // a partir de esta linea se encuentran los metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeProfesores() {
        return numeroDeProfesores;
    }

    public void setNumeroDeProfesores(int numeroDeProfesores) {
        this.numeroDeProfesores = numeroDeProfesores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public int getNumeroDeSalones() {
        return numeroDeSalones;
    }

    public void setNumeroDeSalones(int numeroDeSalones) {
        this.numeroDeSalones = numeroDeSalones;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }

    public int getNumeroDeProfesoresNuevo() {
        return numeroDeProfesores;
    }

    public static void main(String[] args) {
        Colegio colegioUno = new Colegio(
                "Colegio los morales",
                8,
                new Date(),
                10,
                true,
                "javier");
        Colegio colegioDos = new Colegio(
                "Colegio monserrat",
                12,
                new Date(),
                20,
                false,
                "eduardo");
        
        Rector dueno = new Rector(
               "Carlos",
               true);
 
       colegioUno.setPropietario(dueno);
        
        System.out.println("Nombre del propietario");
        System.out.println(colegioUno.getPropietario().getNombre());
           
    }

    void setnumeroDeProfesores(Integer integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getNombreDelColegio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

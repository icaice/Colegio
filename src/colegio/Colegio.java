package colegio;

import java.io.PrintStream;
import java.util.Date;

public class Colegio {

    private String nombre;// nombre del colegio
    private int numeroDeProfesores;//cantidad de profesores que trabajan en el colegio
    private Date fechaDeFundacion; //fecha en la que se fundo el colegio
    private int numeroDeSalones;//numero de salones que hay en el colegio
    private Boolean nacional; //si es conocidad en colombia     
    //private int numeroDeProfesoresNuevo;//es la cantidad de profesores nuevos en el colegio 
    //private int numeroDeAlumnosEnCadaSalon;//es la cantidad de alumnos en cada salon
    //private int numeroDeAlumnosQueTransfieran;//es la cantidad de alumnos que pagan la matricula

    //este es el constructor de clases
    public Colegio(String nombre,
            int numeroDeProfesores,
            Date fechaDeFundacion,
            int numeroDeSalones,
            Boolean nacional
    //int numeroDeProfesoresNuevo,
    //int numeroDeAlumnosEnCadaSalon,
    //int numeroDeAlumnosQueTransfieran
    ) {
        this.nombre = nombre;
        this.numeroDeProfesores = numeroDeProfesores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.numeroDeSalones = numeroDeSalones;
        this.nacional = nacional;
        //this.numeroDeProfesoresNuevo = numeroDeProfesoresNuevo;
        //this.numeroDeAlumnosEnCadaSalon = numeroDeAlumnosEnCadaSalon;
        //this.numeroDeAlumnosQueTransfieran = numeroDeAlumnosQueTransfieran;
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
                true
        );
        Colegio colegioDos = new Colegio(
                "Colegio monserrat",
                12,
                new Date(),
                20,
                false);

        System.out.println(colegioUno.getNombre());
        System.out.println(colegioUno.getNumeroDeSalones());
        System.out.println(colegioUno.getNumeroDeProfesores());

        colegioUno.hacerMasSalones();

        System.out.println(colegioUno.getNombre());
        System.out.println(colegioUno.getNumeroDeSalones());
        System.out.println(colegioUno.getNumeroDeProfesores());
    }

}

package Colegio;

import java.util.Date;


public class ColegioMixto extends Colegio {
    private int numeroDeProfesoresNuevos; /** Es la cantidad de profesores nuevos 
    que hay en el colegio mixto*/
    private int numeroDeAlumnosEnCadaSalon; /** Es la cantidad de alumnos que 
     * hay en cada salon*/
    private int numeroDeAlumnosQuetrasfieren; /** es la cantidad de alumnos que
     * pagan la matricula haciendo tranferencia al colegio*/
    public ColegioMixto ( 
            String nombre,
            int numeroDeProfesores,
            Date fechaDeFundacion,
            int numeroDeSalones,
            Boolean nacional,
            int numeroDeProfesoresNuevos,
            int numeroDeAlumnosEnCadaSalon,
            int numeroDeAlumnosQueTrasfieren ) {
        super (
        
            nombre,
            numeroDeProfesores,
            fechaDeFundacion,
            numeroDeSalones,
            nacional);
        this.numeroDeProfesoresNuevos = numeroDeProfesoresNuevos;
        this.numeroDeAlumnosEnCadaSalon = numeroDeAlumnosEnCadaSalon;
        this.numeroDeAlumnosQuetrasfieren = numeroDeAlumnosQueTrasfieren;
    }
    
    //con este metodo sabremos la cantidad de alumnos que le hacen transferencia al colegio
       public void numeroDePago(){
         if(this.numeroDeAlumnosEnCadaSalon >=30){
              this.numeroDeAlumnosQuetrasfieren >=25;
          }
       }
       
       //aumenta la cantidad de profesores nuevos en 2 y el numero de alumnos en 10
       public void nuevosAlumnos(){
           this.numeroDeProfesoresNuevos += 2;
           this.numeroDeAlumnosEnCadaSalon += 10;
       }
        
        public static void main(String[] args) {
                ColegioMixto Colegio = new ColegioMixto (
                    "Colegio Mixto Los Morales",
                    8,
                    new Date(),
                    10,
                    false,
                    3,
                    25,
                    15);
        ColegioMixto.nuevosAlumnos();      
        System.out.println(ColegioMixto.get());   
        }
}
        
package colegio;

public class Rector {
    public String nombre;
    public Boolean bilingue;

    public Rector(String nombre, Boolean bilingue) {
        this.nombre = nombre;
        this.bilingue = bilingue;
    }

    Rector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getBilingue() {
        return bilingue;
    }

    public void setBilingue(Boolean bilingue) {
        this.bilingue = bilingue;
    }
}

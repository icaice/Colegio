package colegio;

public class Rector {
    public String nombre;
    public Boolean bilingue;

    public Rector(String nombre, Boolean bilingue) {
        this.nombre = nombre;
        this.bilingue = bilingue;
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

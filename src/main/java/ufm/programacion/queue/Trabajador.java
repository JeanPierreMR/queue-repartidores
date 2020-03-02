package ufm.programacion.queue;

public class Trabajador {
    int numeroSS, diasTrabajados;
    String nombre;
    public Trabajador(int numeroSS, String nombre){
        this.nombre = nombre;
        this.numeroSS = numeroSS;
        this.diasTrabajados = 0;
    }
    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

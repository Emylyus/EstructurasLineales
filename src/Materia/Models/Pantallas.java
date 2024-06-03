package Materia.Models;

public class Pantallas {

    private String nombre;
    private String ruta;

    public Pantallas(){
    }

    public Pantallas(String nombre) {
        this.nombre = nombre;
    }
    
    public Pantallas(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    

}

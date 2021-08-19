package aiss.model.api;

public class Jugador {

    private String id;
    private String nombre;
    private String edad;
    private String club;


    public Jugador() {
    }

    public Jugador(String nombre, String edad, String club) {
        this.nombre = nombre;
        this.edad = edad;
        this.club = club;
    }

    public Jugador(String id, String nombre, String edad, String club) {
        this.id=id;
        this.nombre = nombre;
        this.edad = edad;
        this.club = club;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }


}
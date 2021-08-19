package aiss.model.api;

import java.util.ArrayList;
import java.util.List;


public class Equipo {

    private String id;
    private String name;
    private List<Jugador> jugador;

    public Equipo() {}

    public Equipo(String name) {
        this.name = name;
    }

    protected void setJugadores(List<Jugador> j) {
        jugador = j;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Jugador> getJugadores() {
        return jugador;
    }

    public Jugador getJugador(String id) {
        if (jugador==null)
            return null;

        Jugador jugadores =null;
        for(Jugador j: jugador)
            if (j.getId().equals(id))
            {
                jugadores=j;
                break;
            }

        return jugadores;
    }

    public void addJugador(Jugador s) {
        if (jugador==null)
            jugador = new ArrayList<Jugador>();
        jugador.add(s);
    }

    public void deleteJugador(Jugador s) {
        jugador.remove(s);
    }

    public void deleteJugador(String id) {
        Jugador j = getJugador(id);
        if (j!=null)
            jugador.remove(j);
    }

}

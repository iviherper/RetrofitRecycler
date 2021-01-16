package com.example.retrofitrecycler;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="Incidencias", strict = false)
public class Incidencias {
    @ElementList(inline = true, name="Incidencia")
    List<Incidencia> incidencia;

    public List<Incidencia> getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(List<Incidencia> incidencia) {
        this.incidencia = incidencia;
    }
}

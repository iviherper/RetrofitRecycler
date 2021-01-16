package com.example.retrofitrecycler;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="Incidencia",strict = false)
public class Incidencia {
    @Element
    String fh_final;
    @Element
    String fh_inicio;
    @Element
    String descripcion;

    public String getFh_final() {
        return fh_final;
    }

    public void setFh_final(String fh_final) {
        this.fh_final = fh_final;
    }

    public String getFh_inicio() {
        return fh_inicio;
    }

    public void setFh_inicio(String fh_inicio) {
        this.fh_inicio = fh_inicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

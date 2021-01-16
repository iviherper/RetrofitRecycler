package com.example.retrofitrecycler;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IncidenciasXML {
    @GET("informo/tmadrid/incid_aytomadrid.xml")
    Call<Incidencias> pedirIncidencias();
}

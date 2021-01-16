package com.example.retrofitrecycler;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class PedirIncidencias {
    actualizarDatos a;

    public PedirIncidencias(actualizarDatos a) {
        this.a = a;
    }
    public interface actualizarDatos {
        public void actualizarwv(Incidencias i);
    }

    public void pedirIncidencias(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://informo.madrid.es/")
                .addConverterFactory(SimpleXmlConverterFactory.create()).build();

        IncidenciasXML service = retrofit.create(IncidenciasXML.class);
        Call<Incidencias> llamada = service.pedirIncidencias();

        llamada.enqueue(new Callback<Incidencias>() {
            @Override
            public void onResponse(Call<Incidencias> call, Response<Incidencias> response) {
                Incidencias i = response.body();
                a.actualizarwv(i);
            }

            @Override
            public void onFailure(Call<Incidencias> call, Throwable t) {
                Log.d("error",t.getLocalizedMessage());
            }
        });
    }
}

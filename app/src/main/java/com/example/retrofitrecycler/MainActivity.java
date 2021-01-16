package com.example.retrofitrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PedirIncidencias.actualizarDatos{
    RecyclerView recc ;
    RecyclerView.LayoutManager gestor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rec = findViewById(R.id.miVista);
        PedirIncidencias p = new PedirIncidencias(this);
        p.pedirIncidencias();
    }

    public void actualizar(Incidencias incidencias){
        recc = findViewById(R.id.miVista);
        gestor = new LinearLayoutManager(this);
        MiAdaptador adaptador = new MiAdaptador(incidencias);
        recc.setLayoutManager(gestor);
        recc.setAdapter(adaptador);
    }

    @Override
    public void actualizarwv(Incidencias i) {
        actualizar(i);
    }

}
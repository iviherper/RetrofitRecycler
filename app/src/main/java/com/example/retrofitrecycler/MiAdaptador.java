package com.example.retrofitrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiContenedorDeVistas>{
    private Incidencias incidencias;

    public MiAdaptador(Incidencias incidencias) {
        this.incidencias = incidencias;
    }

    @NonNull
    @Override
    public MiAdaptador.MiContenedorDeVistas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_retrofit, parent, false);
        MiContenedorDeVistas contenedor = new MiContenedorDeVistas(vista);
        return contenedor;
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.MiContenedorDeVistas holder, int position) {
        Incidencia i = incidencias.getIncidencia().get(position);
        holder.fec_ini.setText(i.getFh_inicio());
        holder.fec_fin.setText(i.getFh_final());
        holder.desc.setText(i.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return incidencias.getIncidencia().size();
    }

    public static class MiContenedorDeVistas extends RecyclerView.ViewHolder{
        public TextView fec_fin, fec_ini, desc;

        public MiContenedorDeVistas(View vista) {
            super(vista);
            this.fec_fin = vista.findViewById(R.id.fec_fin);
            this.fec_ini = vista.findViewById(R.id.fec_ini);
            this.desc = vista.findViewById(R.id.desc);
        }
    }
}

package com.example.semana3petgram.vista;

import com.example.semana3petgram.modelo.Mascota;
import com.example.semana3petgram.adapter.MascotaAdapter;

import java.util.ArrayList;

public interface IRecyclerViewFragment {

    public void generarLinearLayoutVertical();

    public MascotaAdapter crearAdaptador (ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV (MascotaAdapter adapter);

}

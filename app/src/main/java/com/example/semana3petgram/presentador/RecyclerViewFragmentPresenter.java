package com.example.semana3petgram.presentador;

import android.content.Context;

import com.example.semana3petgram.modelo.ConstructorMascotas;
import com.example.semana3petgram.modelo.Mascota;
import com.example.semana3petgram.vista.IRecyclerViewFragment;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {


    private IRecyclerViewFragment iRecyclerViewFragment;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragment iRecyclerViewFragment, Context context) {
        this.iRecyclerViewFragment = iRecyclerViewFragment;
        this.context = context;
        ObtenerMascotasBaseDatos();
    }

    @Override
    public void ObtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarContactos();

    }

    @Override
    public void mostrarContactos() {
        iRecyclerViewFragment.inicializarAdaptadorRV(iRecyclerViewFragment.crearAdaptador(mascotas));
        iRecyclerViewFragment.generarLinearLayoutVertical();

    }
}

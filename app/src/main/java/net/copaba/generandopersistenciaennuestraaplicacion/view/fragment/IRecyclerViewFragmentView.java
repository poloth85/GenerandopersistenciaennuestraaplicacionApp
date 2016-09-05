package net.copaba.generandopersistenciaennuestraaplicacion.view.fragment;


import net.copaba.generandopersistenciaennuestraaplicacion.adapter.PetAdaptador;
import net.copaba.generandopersistenciaennuestraaplicacion.pojo.Pet;

import java.util.ArrayList;

/**
 * Created by Polo on 01/09/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLineaLayoutVertical();

    public PetAdaptador crearAdaptador(ArrayList<Pet> pets);

    public void inicializarAdaptadorRV(PetAdaptador adaptador);
}

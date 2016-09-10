package net.copaba.integrandowebservicesanuestraaplicacion.presentador;

import android.content.Context;

import net.copaba.integrandowebservicesanuestraaplicacion.db.ConstructorPets;
import net.copaba.integrandowebservicesanuestraaplicacion.pojo.Pet;
import net.copaba.integrandowebservicesanuestraaplicacion.view.fragment.IRecyclerViewFragmentView;

import java.util.ArrayList;

/**
 * Created by Polo on 01/09/16.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorPets constructorPets;
    private ArrayList<Pet> pets;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {

        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        getPetsBaseDatos();

    }

    @Override
    public void getPetsBaseDatos() {

        constructorPets = new ConstructorPets(context);
        pets = constructorPets.getData();
        showPetsRV();
    }

    @Override
    public void showPetsRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(pets));
        iRecyclerViewFragmentView.generarLineaLayoutVertical();
    }
}

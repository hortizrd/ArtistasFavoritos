package com.example.artistasfavoritos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private RecyclerView recyclerViewCantante;
 private RecyclerViewAdaptador adaptadorCantante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerViewCantante= findViewById( R.id.recyclerCantate );
        recyclerViewCantante.setLayoutManager( new LinearLayoutManager( this ) );

        adaptadorCantante = new RecyclerViewAdaptador( obtenerCantantes() );
        recyclerViewCantante.setAdapter( adaptadorCantante );

    }

    public List<CantanteModelo>obtenerCantantes(){
        List<CantanteModelo> cantante = new ArrayList<>();
        cantante.add( new CantanteModelo("Rene Gonzales","Puerto Riqueno",R.drawable.rene ) );
        cantante.add( new CantanteModelo("Laura pausini","Italia",R.drawable.laura ) );
        cantante.add( new CantanteModelo("jhon Secada","Cuba",R.drawable.jhon ) );
        cantante.add( new CantanteModelo("Eros Ramazoti","Italia",R.drawable.eros ) );
        cantante.add( new CantanteModelo("Enrrique Iglesia","Español",R.drawable.enrrique ) );


        return cantante;
    }
}

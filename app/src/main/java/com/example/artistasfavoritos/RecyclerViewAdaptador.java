package com.example.artistasfavoritos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView cantante, nacionalidad;
        private ImageView fotoCantante;

        public ViewHolder(View itemView) {
            super(itemView);
            cantante =itemView.findViewById( R.id.tvCantante );
            nacionalidad = itemView.findViewById( R.id.tvNacionalidad );
            fotoCantante = itemView.findViewById( R.id.imgcantante );

        }
    }

    public List<CantanteModelo> cantanteLista;

    public RecyclerViewAdaptador(List<CantanteModelo> cantanteLista) {
        this.cantanteLista = cantanteLista;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.item_cantante,parent,false );
        ViewHolder viewHolder = new ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cantante.setText( cantanteLista.get( position ).getCatante());
        holder.nacionalidad.setText( cantanteLista.get(position).getNacionalidad() );
        holder.fotoCantante.setImageResource( cantanteLista.get( position ).getImgcatante() );

    }

    @Override
    public int getItemCount() {
        return cantanteLista.size();
    }
}

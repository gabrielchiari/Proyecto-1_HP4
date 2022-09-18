package com.gabrielchiari.proyecto_1_hp4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;

import java.util.List;


public class Adapter extends BaseAdapter {
    Context contexto;
    List<DataCandidate> candidates;

    public Adapter(Context contexto, List<DataCandidate> listaObjetos) {
        this.contexto = contexto;
        candidates = listaObjetos;
    }

    public int getCount() {
        return candidates.size();
    }

    @Override
    public Object getItem(int position) {
        return candidates.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.vote_container_item, null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.ivProfile);
        TextView nombre = (TextView) vista.findViewById(R.id.txtName);

        nombre.setText(candidates.get(position).getFullName());
        imagen.setImageResource(candidates.get(position).getAvatar());

        return vista;
    }
}

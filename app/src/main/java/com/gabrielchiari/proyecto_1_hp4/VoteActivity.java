package com.gabrielchiari.proyecto_1_hp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;
import com.gabrielchiari.proyecto_1_hp4.utils.GsonHelper;

import java.util.ArrayList;

public class VoteActivity extends AppCompatActivity {
    ArrayList<DataCandidate> listOfCandidates;

    //declaracion de variables de la vista
    private ListView listadatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        listOfCandidates = new ArrayList<DataCandidate>();
        initCandidateData();

        listadatos = findViewById(R.id.listOfCandidates);

        Adapter miadaptador = new Adapter(getApplicationContext(), listOfCandidates);
        listadatos.setAdapter(miadaptador);

        listadatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj = listadatos.getItemAtPosition(position);
                DataCandidate cantidato = (DataCandidate)obj;
                cantidato.setVotos(+1);

                Intent intentCandidate = new Intent();
                intentCandidate.putExtra("listOfCandidates", GsonHelper.serialize(listOfCandidates));
                intentCandidate.putExtra("hasVoted", true);
                startActivity(intentCandidate);

                finish();
            }
        });

    }

    private void initCandidateData() {
        listOfCandidates.add(new DataCandidate(1,R.drawable.ing_martin_candanedo,getResources().getString(R.string.candidato_martin_candanedo)));
        listOfCandidates.add(new DataCandidate(2,R.drawable.mgtr_vivian_valenzuelar,getResources().getString(R.string.candidato_vivian_valenzuela)));
        listOfCandidates.add(new DataCandidate(3,R.drawable.omar_o_aizpurua_p,getResources().getString(R.string.candidato_omar_aizpurua)));
    }
}
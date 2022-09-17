package com.gabrielchiari.proyecto_1_hp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;

import java.util.ArrayList;

public class VoteActivity extends AppCompatActivity {
    ArrayList<DataCandidate> candidatos;

    //declaracion de variables de la vista
    private ListView listadatos;
    private ImageView backButton;
    private Button votarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        candidatos = new ArrayList<DataCandidate>();

        listadatos = findViewById(R.id.listOfCandidates);
        votarButton = findViewById(R.id.btnVotar);

        Adapter miadaptador = new Adapter(getApplicationContext(), candidatos);
        listadatos.setAdapter(miadaptador);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
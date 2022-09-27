package com.gabrielchiari.proyecto_1_hp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;
import com.gabrielchiari.proyecto_1_hp4.data.DataStudent;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ArrayList<DataStudent> listOfStudents;
    ArrayList<DataCandidate> listOfCandidates;
    TextView tvMartin, tvVivian, tvOmar;
    Button btnVolver;
    Integer tVotos;
    TextView[] imprimir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getData = getIntent();
        tVotos = getData.getIntExtra("tVotos", 0);
        listOfStudents = (ArrayList<DataStudent>) getData.getSerializableExtra("listOfStudents");
        listOfCandidates = (ArrayList<DataCandidate>) getData.getSerializableExtra("listOfCandidates");


        tvMartin = findViewById(R.id.tvMartin);
        tvVivian = findViewById(R.id.tvVivian);
        tvOmar = findViewById(R.id.tvOmar);
        btnVolver = findViewById(R.id.btnVolver);
        imprimir = new TextView[]{tvMartin, tvVivian, tvOmar};

        if (tVotos != 0) {
            setView();
        }

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("tVotos", tVotos);
                intent.putExtra("listOfStudents", listOfStudents);
                intent.putExtra("listOfCandidates",listOfCandidates);
                startActivity(intent);
                finish();
            }
        });
    }

    // pinta la data en pantalla
    private void setView() {
        for (int j =0; j < imprimir.length; j++){
            String porcentaje = String.format("%.2f", (((listOfCandidates.get(j).getVotos()*1.0) / tVotos) * 100));
            imprimir[j].setText("Votos: " + listOfCandidates.get(j).getVotos() + ", Porcentaje: " + porcentaje + "%");
        }
    }

}
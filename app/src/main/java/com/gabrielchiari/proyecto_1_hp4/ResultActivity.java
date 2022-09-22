package com.gabrielchiari.proyecto_1_hp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView tvMartin, tvVivian, tvOmar;
    Button btnVolver;
    int totalVotes, omarVotes, vivianVotes, martinVotes, Tlogin;
    int [] VLogin = new int[3];

    ArrayList<DataCandidate> listOfCandidates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getData = getIntent();
        VLogin = getData.getIntArrayExtra("ArrayVotos");
        Tlogin = getData.getIntExtra("TotalVoto", 0);

        /*totalVotes = getData.getIntExtra("totalVotes", 0);
        martinVotes = getData.getIntExtra("martinVotes", 0);
        vivianVotes = getData.getIntExtra("vivianVotes", 0);
        omarVotes = getData.getIntExtra("omarVotes", 0);*/


        tvMartin = findViewById(R.id.tvMartin);
        tvVivian = findViewById(R.id.tvVivian);
        tvOmar = findViewById(R.id.tvOmar);
        btnVolver = findViewById(R.id.btnVolver);

        if (Tlogin != 0) {
            setView();
        }

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // pinta la data en pantalla
    private void setView() {
        /*tvMartin.setText("Votos: " + martinVotes + ", Porcentaje: " + ((martinVotes / totalVotes) * 100) + "%");
        tvVivian.setText("Votos: " + vivianVotes + ", Porcentaje: " + ((vivianVotes / totalVotes) * 100) + "%");
        tvOmar.setText("Votos: " + omarVotes + ", Porcentaje: " + ((omarVotes / totalVotes) * 100) + "%");*/
        tvMartin.setText("Votos: " + VLogin[0] + ", Porcentaje: " + ((VLogin[0] / Tlogin) * 100) + "%");
        tvVivian.setText("Votos: " + VLogin[1] + ", Porcentaje: " + ((VLogin[1] / Tlogin) * 100) + "%");
        tvOmar.setText("Votos: " + VLogin[2] + ", Porcentaje: " + ((VLogin[2] / Tlogin) * 100) + "%");
    }

}
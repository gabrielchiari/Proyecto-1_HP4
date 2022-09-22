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
    int totalVotes = 0, omarVotes = 0, vivianVotes = 0, martinVotes = 0;
    ArrayList<DataCandidate> listOfCandidates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getData = getIntent();
        totalVotes = getData.getIntExtra("totalVotes", 0);
        martinVotes = getData.getIntExtra("martinVotes", 0);
        vivianVotes = getData.getIntExtra("vivianVotes", 0);
        omarVotes = getData.getIntExtra("omarVotes", 0);


        tvMartin = findViewById(R.id.tvMartin);
        tvVivian = findViewById(R.id.tvVivian);
        tvOmar = findViewById(R.id.tvOmar);
        btnVolver = findViewById(R.id.btnVolver);

        if (totalVotes != 0) {
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
        tvMartin.setText("Votos: " + martinVotes + ", Porcentaje: " + ((martinVotes / totalVotes) * 100) + "%");
        tvVivian.setText("Votos: " + vivianVotes + ", Porcentaje: " + ((vivianVotes / totalVotes) * 100) + "%");
        tvOmar.setText("Votos: " + omarVotes + ", Porcentaje: " + ((omarVotes / totalVotes) * 100) + "%");
    }

}
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
    Integer tVotos;
    int [] votos = new int[3];

    ArrayList<DataCandidate> listOfCandidates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getData = getIntent();
        votos = getData.getIntArrayExtra("votos");
        tVotos = getData.getIntExtra("tVotos", 0);


        tvMartin = findViewById(R.id.tvMartin);
        tvVivian = findViewById(R.id.tvVivian);
        tvOmar = findViewById(R.id.tvOmar);
        btnVolver = findViewById(R.id.btnVolver);

        if (tVotos != 0) {
            setView();
        }

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("votos", votos);
                intent.putExtra("tVotos", tVotos);
                startActivity(intent);
                finish();
            }
        });
    }

    // pinta la data en pantalla
    private void setView() {
        String martinS = String.format("%.2f", (((votos[0]*1.0) / tVotos) * 100));
        String vivianS = String.format("%.2f", (((votos[1]*1.0) / tVotos) * 100));
        String omarS = String.format("%.2f", (((votos[1]*1.0) / tVotos) * 100));
        tvMartin.setText("Votos: " + votos[0] + ", Porcentaje: " + martinS + "%");
        tvVivian.setText("Votos: " + votos[1] + ", Porcentaje: " + vivianS + "%");
        tvOmar.setText("Votos: " + votos[2] + ", Porcentaje: " + omarS + "%");
    }

}
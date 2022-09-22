package com.gabrielchiari.proyecto_1_hp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvMartin, tvVivian, tvOmar;
    Button btnVolver, btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvMartin = findViewById(R.id.tvMartin);
        tvVivian = findViewById(R.id.tvVivian);
        tvOmar = findViewById(R.id.tvOmar);
        btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVolver = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intentVolver);
            }
        });

        //Boton para mostrar la cantidad de votos
        /*btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMostrar = getIntent();
                String getVotos = intentMostrar.getStringExtra("");
                String getVotos2 = intentMostrar.getStringExtra("");
                String getVotos3 = intentMostrar.getStringExtra("");
                tvMartin.setText("Votos: " + getVotos);
                tvVivian.setText("Votos: " + getVotos2);
                tvOmar.setText("Votos: " + getVotos3);
            }
        });*/
    }
}
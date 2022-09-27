package com.gabrielchiari.proyecto_1_hp4;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;
import com.gabrielchiari.proyecto_1_hp4.data.DataStudent;

import java.util.ArrayList;

public class VoteActivity extends AppCompatActivity {
    private ArrayList<DataStudent> listOfStudents;
    private ArrayList<DataCandidate> listOfCandidates;
    private RadioGroup rgCandidates;
    private Button btnSendVote;
    private ImageView ivAvatarCandidates;
    private int tVotos;
    private String dniStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        Intent getData = getIntent();
        //recibiendo la cedula del que voto
        dniStudent = getData.getStringExtra("dniStudent");
        listOfStudents = (ArrayList<DataStudent>) getData.getSerializableExtra("listOfStudents");
        listOfCandidates = (ArrayList<DataCandidate>) getData.getSerializableExtra("listOfCandidates");
        if (getData.getIntArrayExtra("votos") != null) {
            tVotos = getData.getIntExtra("tVotos", 0);
        }

//        Toast toast = Toast.makeText(getApplicationContext(), getResources().getText(R.string.bienvenido_estudiante), Toast.LENGTH_LONG);
//        toast.show();


        rgCandidates = findViewById(R.id.rgCandidates);
        ivAvatarCandidates = findViewById(R.id.ivAvatarCandidates);
        btnSendVote = findViewById(R.id.btnSendVote);

        rgCandidates.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btnSendVote.setVisibility(View.VISIBLE);
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rbVivian:
                        ivAvatarCandidates.setImageResource(R.drawable.mgtr_vivian_valenzuelar);
                        break;

                    case R.id.rbMartin:
                        ivAvatarCandidates.setImageResource(R.drawable.ing_martin_candanedo);
                        break;

                    case R.id.rbOmar:
                        ivAvatarCandidates.setImageResource(R.drawable.omar_o_aizpurua_p);
                        break;
                }
            }
        });

        btnSendVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Se pasa el arraylist, por lo cual no hay necesidad de usar otras variables, solo cambias el valor de la variable en la misma lista y pasas la lista
                for (DataCandidate candidatos : listOfCandidates) {
                    if (candidatos.getId() == (rgCandidates.getCheckedRadioButtonId())) {
                        candidatos.setVotos(+1);
                        tVotos += 1;
                    }
                }
                //pasando las  listas con los nuevos valores
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("tVotos", tVotos);
                putVote();
                intent.putExtra("listOfStudents", listOfStudents);
                intent.putExtra("listOfCandidates", listOfCandidates);
                startActivity(intent);
                finish();
            }

        });


    }

    // se le asigna al estudiante que ya voto
    private void putVote() {
        for (DataStudent estudiante : listOfStudents) {
            if (estudiante.getCedula().equals(dniStudent)) {
                estudiante.setVoted(true);
            }
        }
    }
}
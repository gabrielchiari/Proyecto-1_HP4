package com.gabrielchiari.proyecto_1_hp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;

import java.util.ArrayList;

public class VoteActivity extends AppCompatActivity {
    ArrayList<DataCandidate> listOfCandidates;

    private RadioGroup rgCandidates;
    private Button btnSendVote;
    private ImageView ivAvatarCandidates;
    private String voteStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        Toast toast = Toast.makeText(getApplicationContext(), getResources().getText(R.string.bienvenido_estudiante), Toast.LENGTH_LONG);
        toast.show();

        Intent getDATA = getIntent();
        voteStudent = getDATA.getStringExtra("voteStudent");

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
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("candidateSelected", rgCandidates.getCheckedRadioButtonId());
                intent.putExtra("voteStudent", voteStudent);
                startActivity(intent);
                finish();
            }
        });


    }
}
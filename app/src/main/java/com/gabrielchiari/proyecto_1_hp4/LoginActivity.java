package com.gabrielchiari.proyecto_1_hp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;
import com.gabrielchiari.proyecto_1_hp4.data.DataStudent;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<DataStudent> listOfStudents;
    ArrayList<DataCandidate> listOfCandidates;
    EditText et_cedula;
    Button btnVotar, btnResultado;
    boolean comprobar = false;
    int[] VRecibido = new int[3];
    int TRecibido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_cedula = findViewById(R.id.et_cedula);
        btnVotar = findViewById(R.id.btnVotar);
        btnResultado = findViewById(R.id.btnResultado);

        listOfStudents = new ArrayList<DataStudent>();
        initStudentData();
        listOfCandidates = new ArrayList<DataCandidate>();
        initCandidateData();

        btnVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revision();
            }
        });
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRes = new Intent(getApplicationContext(), ResultActivity.class);
                intentRes.putExtra("ArrayVotos", VRecibido);
                intentRes.putExtra("TotalVoto", TRecibido);
                /*intentRes.putExtra("martinVotes", listOfCandidates.get(0).getVotos());
                intentRes.putExtra("vivianVotes", listOfCandidates.get(1).getVotos());
                intentRes.putExtra("omarVotes", listOfCandidates.get(2).getVotos());
                intentRes.putExtra("totalVotes", getTotalVotes());*/
                startActivity(intentRes);
            }
        });


        //int idCandidate = intent.getIntExtra("candidateSelected", 0);
        //String voteStudent = intent.getStringExtra("voteStudent");
        /*if (idCandidate != 0) {
            putVoto(idCandidate);
            setHasVote(voteStudent);
        }*/

    }

    private void initCandidateData() {
        listOfCandidates.add(new DataCandidate(R.id.rbMartin, R.drawable.ing_martin_candanedo, getResources().getString(R.string.candidato_martin_candanedo)));
        listOfCandidates.add(new DataCandidate(R.id.rbVivian, R.drawable.mgtr_vivian_valenzuelar, getResources().getString(R.string.candidato_vivian_valenzuela)));
        listOfCandidates.add(new DataCandidate(R.id.rbOmar, R.drawable.omar_o_aizpurua_p, getResources().getString(R.string.candidato_omar_aizpurua)));
    }

    private void initStudentData() {
        listOfStudents.add(new DataStudent("08-0944-000327", "EDWIN", "ARROCHA", "M"));
        listOfStudents.add(new DataStudent("03-0740-001394", "MICHELLE", "BRENES", "F"));
        listOfStudents.add(new DataStudent("20-0053-004282", "EDDY", "BUSTAMANTE ", "M"));
        listOfStudents.add(new DataStudent("08-0943-001867", "ALEJANDRA", "CABALLERO", "F"));
        listOfStudents.add(new DataStudent("08-0937-000503", "GABRIEL", "CHIARI", "M"));
        listOfStudents.add(new DataStudent("08-0952-002444", "KEVIN", "CORONADO", "M"));
        listOfStudents.add(new DataStudent("08-0943-000012", "LUIS", "DELGADO", "M"));
        listOfStudents.add(new DataStudent("08-0986-000549", "MARC", "DUDLEY", "M"));
        listOfStudents.add(new DataStudent("08-0957-001827", "DIEGO", "FERNANDEZ", "M"));
        listOfStudents.add(new DataStudent("08-0940-001311", "MARÍA", "FLORES", "F"));
        listOfStudents.add(new DataStudent("08-0863-001620", "DONALDO", "FRAZER", "M"));
        listOfStudents.add(new DataStudent("08-0964-000691", "MIGUEL", "GASCÓN", "M"));
        listOfStudents.add(new DataStudent("08-0954-001126", "ANDREW", "GONZALEZ", "M"));
        listOfStudents.add(new DataStudent("08-1039-001537", "VALERIE", "HERNÁNDEZ", "F"));
        listOfStudents.add(new DataStudent("08-0925-001168", "TOMMY", "HO", "M"));
        listOfStudents.add(new DataStudent("08-0940-001505", "JEAN", "JIMÉNEZ", "M"));
        listOfStudents.add(new DataStudent("08-0938-000925", "FELIPE", "LOO", "M"));
        listOfStudents.add(new DataStudent("03-0743-002493", "LISSETH", "MCDONALD", "F"));
        listOfStudents.add(new DataStudent("0E-0008-169755", "JESUS", "MONAGAS", "M"));
        listOfStudents.add(new DataStudent("08-0971-001811", "DIANA", "MORENO", "F"));
        listOfStudents.add(new DataStudent("08-0940-000408", "GERARDO", "MORENO", "M"));
        listOfStudents.add(new DataStudent("08-0937-001640", "JUAN", "NAVARRO", "M"));
        listOfStudents.add(new DataStudent("08-0939-001578", "JULIO", "NAVAS", "M"));
        listOfStudents.add(new DataStudent("08-0942-001406", "ANEL", "PINZÓN", "M"));
        listOfStudents.add(new DataStudent("06-0722-000724", "JANIEL", "PINZÓN", "M"));
        listOfStudents.add(new DataStudent("08-0941-001215", "ANTONIO", "QIU", "M"));
        listOfStudents.add(new DataStudent("08-0962-001218", "CARLOS", "RICORD", "M"));
        listOfStudents.add(new DataStudent("08-0941-000924", "DAVID", "RIOS", "M"));
        listOfStudents.add(new DataStudent("08-0980-002414", "SERGIO", "RODRIGUEZ", "M"));
        listOfStudents.add(new DataStudent("03-0742-002055", "ZULIXA", "SALAS", "F"));
        listOfStudents.add(new DataStudent("08-0942-001192", "LUIS", "SAMANIEGO", "M"));
        listOfStudents.add(new DataStudent("08-0904-001189", "ARY", "SÁNCHEZ", "M"));
        listOfStudents.add(new DataStudent("08-0959-000857", "DIONISIO", "SANTOS", "M"));
        listOfStudents.add(new DataStudent("08-0964-001554", "BRYAN", "THOMAS", "M"));
        listOfStudents.add(new DataStudent("08-1066-001018", "CARLOS", "TUÑÓN", "M"));
        listOfStudents.add(new DataStudent("08-1055-000701", "GENESIS", "VITALE", "F"));
        listOfStudents.add(new DataStudent("08-0970-000242", "FERNANDO", "ZENG", "M"));
        listOfStudents.add(new DataStudent("03-0752-001461", "CARLOS", "ZHONG", "M"));
        listOfStudents.add(new DataStudent("03-0745-000950", "EIMY", "GUERRA", "F"));
    }

    //funcion para revisar si existe o no la cedula
    public void revision() {
        try {
            for (DataStudent estudiante : listOfStudents) {
                if (et_cedula.getText().toString().equals(estudiante.getCedula())) {
                    if (!estudiante.getVoted()) {
                        comprobar = true;
                        Intent votar = new Intent(getApplicationContext(), VoteActivity.class);
                        votar.putExtra("voteStudent", estudiante.getCedula());
                        startActivity(votar);
                        break;
                    } else {
                        throw new IllegalArgumentException((String) getResources().getText(R.string.done_vote));
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            Toast toast = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG);
            toast.show();
        }
        if (comprobar = false){
            Toast toast = Toast.makeText(getApplicationContext(),  getResources().getText(R.string.invalid_cedula),Toast.LENGTH_SHORT);
            toast.show();
        }
        comprobar = false;
    }

    //funcion de asignacion voto al candidato
    private void putVoto(int idCandidate) {
        for (DataCandidate candidate : listOfCandidates) {
            if (candidate.getId() == idCandidate) {
                candidate.setVotos(+1);
            }
        }
    }

    //funcion para asignarle que ya voto al estudiante
    private void setHasVote(String cedula) {
        for (DataStudent estudiante : listOfStudents) {
            if (estudiante.getCedula().equals(cedula)) {
                estudiante.setVoted(true);
            }
        }

    }

    // obtiene el total de votos realizados
    private int getTotalVotes() {
        Integer totalVotes = 0;
        for (DataCandidate candidate : listOfCandidates) {
            totalVotes += candidate.getVotos();
        }
        return totalVotes;
    }
}








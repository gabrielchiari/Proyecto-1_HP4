package com.gabrielchiari.proyecto_1_hp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.gabrielchiari.proyecto_1_hp4.data.DataCandidate;
import com.gabrielchiari.proyecto_1_hp4.data.DataStudent;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<DataStudent> listOfStudents;
    ArrayList<DataCandidate> listOfCandidates;
    EditText et_cedula;
    Button btnVotar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_cedula = findViewById(R.id.et_cedula);
        btnVotar = findViewById(R.id.btnVotar);

        listOfStudents = new ArrayList<DataStudent>();
        initStudentData();
        listOfCandidates = new ArrayList<DataCandidate>();
        initCandidateData();


        Intent votado = getIntent();

        }

    private void initCandidateData() {
        listOfCandidates.add(new DataCandidate(1,R.drawable.IngMartinCandanedo,getResources().getString(R.string.candidato_martin_candanedo)));
        listOfCandidates.add(new DataCandidate(2,R.drawable.MgtrVivianValenzuelaR,getResources().getString(R.string.candidato_vivian_valenzuela)));
        listOfCandidates.add(new DataCandidate(3,R.drawable.OmarOAizpuruaP,getResources().getString(R.string.candidato_omar_aizpurua)));
    }

    private void initStudentData() {
        listOfStudents.add(new DataStudent("08-0944-000327"));
        listOfStudents.add(new DataStudent("03-0740-001394"));
        listOfStudents.add(new DataStudent("20-0053-004282"));
        listOfStudents.add(new DataStudent("08-0943-001867"));
        listOfStudents.add(new DataStudent("08-0937-000503"));
        listOfStudents.add(new DataStudent("08-0952-002444"));
        listOfStudents.add(new DataStudent("08-0943-000012"));
        listOfStudents.add(new DataStudent("08-0986-000549"));
        listOfStudents.add(new DataStudent("08-0957-001827"));
        listOfStudents.add(new DataStudent("08-0940-001311"));
        listOfStudents.add(new DataStudent("08-0863-001620"));
        listOfStudents.add(new DataStudent("08-0964-000691"));
        listOfStudents.add(new DataStudent("08-0954-001126"));
        listOfStudents.add(new DataStudent("08-1039-001537"));
        listOfStudents.add(new DataStudent("08-0925-001168"));
        listOfStudents.add(new DataStudent("08-0940-001505"));
        listOfStudents.add(new DataStudent("08-0938-000925"));
        listOfStudents.add(new DataStudent("03-0743-002493"));
        listOfStudents.add(new DataStudent("0E-0008-169755"));
        listOfStudents.add(new DataStudent("08-0971-001811"));
        listOfStudents.add(new DataStudent("08-0940-000408"));
        listOfStudents.add(new DataStudent("08-0937-001640"));
        listOfStudents.add(new DataStudent("08-0939-001578"));
        listOfStudents.add(new DataStudent("08-0942-001406"));
        listOfStudents.add(new DataStudent("06-0722-000724"));
        listOfStudents.add(new DataStudent("08-0941-001215"));
        listOfStudents.add(new DataStudent("08-0962-001218"));
        listOfStudents.add(new DataStudent("08-0941-000924"));
        listOfStudents.add(new DataStudent("08-0980-002414"));
        listOfStudents.add(new DataStudent("03-0742-002055"));
        listOfStudents.add(new DataStudent("08-0942-001192"));
        listOfStudents.add(new DataStudent("08-0904-001189"));
        listOfStudents.add(new DataStudent("08-0959-000857"));
        listOfStudents.add(new DataStudent("08-0964-001554"));
        listOfStudents.add(new DataStudent("08-1066-001018"));
        listOfStudents.add(new DataStudent("08-1055-000701"));
        listOfStudents.add(new DataStudent("08-0970-000242"));
        listOfStudents.add(new DataStudent("03-0752-001461"));
        listOfStudents.add(new DataStudent("03-0745-000950"));
    }
}


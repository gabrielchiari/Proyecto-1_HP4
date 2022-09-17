package com.gabrielchiari.proyecto_1_hp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.gabrielchiari.proyecto_1_hp4.data.DataStudent;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ArrayList<DataStudent> Lista;
    EditText et_cedula;
    Button btnVotar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_cedula = findViewById(R.id.et_cedula);
        btnVotar = findViewById(R.id.btnVotar);

        Lista = new ArrayList<DataStudent>();

        Lista.add(new DataStudent("08-0944-000327"));
        Lista.add(new DataStudent("03-0740-001394"));
        Lista.add(new DataStudent("20-0053-004282"));
        Lista.add(new DataStudent("08-0943-001867"));
        Lista.add(new DataStudent("08-0937-000503"));
        Lista.add(new DataStudent("08-0952-002444"));
        Lista.add(new DataStudent("08-0943-000012"));
        Lista.add(new DataStudent("08-0986-000549"));
        Lista.add(new DataStudent("08-0957-001827"));
        Lista.add(new DataStudent("08-0940-001311"));
        Lista.add(new DataStudent("08-0863-001620"));
        Lista.add(new DataStudent("08-0964-000691"));
        Lista.add(new DataStudent("08-0954-001126"));
        Lista.add(new DataStudent("08-1039-001537"));
        Lista.add(new DataStudent("08-0925-001168"));
        Lista.add(new DataStudent("08-0940-001505"));
        Lista.add(new DataStudent("08-0938-000925"));
        Lista.add(new DataStudent("03-0743-002493"));
        Lista.add(new DataStudent("0E-0008-169755"));
        Lista.add(new DataStudent("08-0971-001811"));
        Lista.add(new DataStudent("08-0940-000408"));
        Lista.add(new DataStudent("08-0937-001640"));
        Lista.add(new DataStudent("08-0939-001578"));
        Lista.add(new DataStudent("08-0942-001406"));
        Lista.add(new DataStudent("06-0722-000724"));
        Lista.add(new DataStudent("08-0941-001215"));
        Lista.add(new DataStudent("08-0962-001218"));
        Lista.add(new DataStudent("08-0941-000924"));
        Lista.add(new DataStudent("08-0980-002414"));
        Lista.add(new DataStudent("03-0742-002055"));
        Lista.add(new DataStudent("08-0942-001192"));
        Lista.add(new DataStudent("08-0904-001189"));
        Lista.add(new DataStudent("08-0959-000857"));
        Lista.add(new DataStudent("08-0964-001554"));
        Lista.add(new DataStudent("08-1066-001018"));
        Lista.add(new DataStudent("08-1055-000701"));
        Lista.add(new DataStudent("08-0970-000242"));
        Lista.add(new DataStudent("03-0752-001461"));
        Lista.add(new DataStudent("03-0745-000950"));

        Intent votado = getIntent();
        };
    }


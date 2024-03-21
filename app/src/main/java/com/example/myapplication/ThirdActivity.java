package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DAO.MySQLiteHelper;

public class ThirdActivity extends AppCompatActivity {

    private TextView Nom;
    private TextView Prenom;
    private TextView Adresse;
    private TextView Tel;
    private TextView Mail;
    private TextView Classe;
    private TextView Specialite;

    private EditText editNom;
    private EditText editPrenom;
    private EditText editAdresse;
    private EditText editTel;
    private EditText editMail;
    private EditText editClasse;
    private EditText editSpecialite;

    private ImageButton ButtonRetour;
    private ImageButton ButtonExit;
    MySQLiteHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        db = new MySQLiteHelper(this);
        initialisation();
    }

    public void initialisation(){
        Nom=(TextView)findViewById(R.id.Nom);
        Prenom=(TextView)findViewById(R.id.Prenom);
        Adresse=(TextView)findViewById(R.id.Adresse);
        Tel=(TextView)findViewById(R.id.Tel);
        Mail=(TextView)findViewById(R.id.Mail);
        Classe=(TextView)findViewById(R.id.Classe);
        Specialite=(TextView)findViewById(R.id.Specialite);

        editNom=(EditText) findViewById(R.id.editNom);
        editPrenom=(EditText) findViewById(R.id.editPrenom);
        editAdresse=(EditText) findViewById(R.id.editAdresse);
        editTel=(EditText) findViewById(R.id.editTel);
        editMail=(EditText) findViewById(R.id.editMail);
        editClasse=(EditText) findViewById(R.id.editClasse);
        editSpecialite=(EditText) findViewById(R.id.editSpecialite);

        ButtonRetour=(ImageButton) findViewById(R.id.ButtonRetour);
        ButtonExit=(ImageButton) findViewById(R.id.ButtonExit);
        Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
        Intent intent1 = new Intent(ThirdActivity.this, MainActivity.class);

        ButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        ButtonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }
}

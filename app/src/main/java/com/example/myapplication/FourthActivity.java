package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {

    private TextView DateVisite;
    private TextView NoteEnt;
    private TextView NoteDos;
    private TextView NoteOral;
    private TextView DateLim;
    private TextView SujMem;
    private TextView Remarques;

    private EditText editDateVis;
    private EditText editNoteEnt;
    private EditText editNoteDos;
    private EditText editNoteOral;
    private EditText editDateLim;
    private EditText editSujMem;
    private EditText editRemarques;

    private ImageButton ButtonRetour;
    private ImageButton ButtonExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);
        initialisation();

    }

    public void initialisation(){
        DateVisite=(TextView) findViewById(R.id.DateVisite);
        NoteEnt=(TextView) findViewById(R.id.NoteEnt);
        NoteDos=(TextView) findViewById(R.id.NoteDos);
        NoteOral=(TextView) findViewById(R.id.NoteOral);
        DateLim=(TextView) findViewById(R.id.DateLim);
        SujMem=(TextView) findViewById(R.id.SujMem);
        Remarques=(TextView) findViewById(R.id.Remarques);

        editDateVis=(EditText) findViewById(R.id.editDateVis);
        editNoteEnt=(EditText) findViewById(R.id.editNoteEnt);
        editNoteDos=(EditText) findViewById(R.id.editNoteDos);
        editNoteOral=(EditText) findViewById(R.id.editNoteOral);
        editDateLim=(EditText) findViewById(R.id.editDateLim);
        editSujMem=(EditText) findViewById(R.id.editSujMem);
        editRemarques=(EditText) findViewById(R.id.editRemarques);

        ButtonRetour=(ImageButton) findViewById(R.id.ButtonRetour);
        ButtonExit=(ImageButton) findViewById(R.id.ButtonExit);
        Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
        Intent intent1 = new Intent(FourthActivity.this, MainActivity.class);

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
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private Button ButtonInfo;
    private Button ButtonNotes;
    private ImageButton ButtonRetour;
    private ImageButton ButtonExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initialisation();
    }

    public void initialisation(){
        ButtonInfo =(Button)findViewById(R.id.ButtonInfo);
        ButtonNotes=(Button)findViewById(R.id.ButtonNotes);
        ButtonRetour=(ImageButton)findViewById(R.id.ButtonRetour);
        ButtonExit=(ImageButton)findViewById(R.id.ButtonExit);
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        Intent intent1 = new Intent(SecondActivity.this, FourthActivity.class);
        Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
        Intent intent3 = new Intent(SecondActivity.this, MainActivity.class);
        ButtonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        ButtonNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
        ButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
        ButtonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent3);
            }
        });
    }
}

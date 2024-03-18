package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView Logo;
    private TextView TextViewUtilisateur;
    private TextView TextViewMdp;
    private TextView TextViewMessage;
    private String msg;
    private EditText EditTextLogin;
    private EditText EditTextMdp;
    private Button ButtonConnect;
    private ArrayList<Utilisateur> mesUtilisateurs;
    private Utilisateur user;
    private String idLogin;
    private String mdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisation();
        init_Utilisateur();
    }

    public void initialisation(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        TextViewUtilisateur = (TextView)findViewById(R.id.TextViewUtilisateur);
        TextViewMdp = (TextView)findViewById(R.id.TextViewMdp);
        TextViewMessage=(TextView) findViewById(R.id.TextViewMessage);
        EditTextLogin =(EditText) findViewById(R.id.EditTextLogin);
        EditTextMdp=(EditText) findViewById(R.id.EditTextMdp);
        ButtonConnect=(Button) findViewById(R.id.ButtonConnect);
        ButtonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idLogin=EditTextLogin.getText().toString();
                mdp=EditTextMdp.getText().toString();
                if(controle(idLogin, mdp)){
                    msg="connexion avec succès";
                    startActivity(intent);
                }else{
                    msg="connexion échoué";
                }
                TextViewMessage.setText(msg);
            }
        });
    }

    public void init_Utilisateur(){
        Utilisateur user1 = new Utilisateur("hieu","123456");
        Utilisateur user2 = new Utilisateur("tran", "1234");
        Utilisateur user3 = new Utilisateur("tran hieu", "654321");
        mesUtilisateurs = new ArrayList<Utilisateur>();
        mesUtilisateurs.add(user1);
        mesUtilisateurs.add(user2);
        mesUtilisateurs.add(user3);
    }

    public boolean controle(String idLogin, String mdp){
        for(Utilisateur user: mesUtilisateurs) {
            if (user.getIdLogin().equals(idLogin) && user.getMdp().equals(mdp)) {
                return true;
            }
        }
        return false;
    }
}
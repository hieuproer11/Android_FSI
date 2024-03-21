package com.example.myapplication.DAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.myapplication.BO.Etudiant;

import java.util.ArrayList;


public class EtudiantDAO extends DAO<Etudiant>{

public SQLiteDatabase database;


    @Override
    public boolean create(Etudiant obj) {
        return false;
    }

    @Override
    public boolean delete(Etudiant obj) {
        return false;
    }

    @Override
    public boolean update(Etudiant obj) {
        return false;
    }

    @Override
    public Etudiant find(int id) {
        Etudiant unEtudiant = null;
            Cursor curseur = database.query(true, "Etudiant", new String[]{"idEtu", "nom", "prenom", "adresse", "tel", "mail", "classe", "speci"},
            "idEtu = " +id, null, null, null, null, null);
        while (curseur.moveToNext()){
            unEtudiant = cursorToEtudiant(curseur);
        }
        curseur.close();
        return unEtudiant;
    }

    private Etudiant cursorToEtudiant(Cursor curseur) {
        return null;
    }


    @Override
    public ArrayList<Etudiant> getAll() {
        return null;
    }
}

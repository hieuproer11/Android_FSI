package com.example.myapplication.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_COMMENTS = "ETUDIANT";
    public static final String TABLE_COMMENTS1 ="BILAN";
    public static final String DATABASE_NAME = "AndroidFSI.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_CREATE ="CREATE TABLE IF  NOT EXISTS " + TABLE_COMMENTS +
            "(idEtu integer primary key autoincrement, " + "nom text, prenom text, adresse text, mail text, speci text);";
    private static final String DATABASE_CREATE1 ="CREATE TABLE IF NOT EXISTS " + TABLE_COMMENTS1 +
            "(idBilan integer primary key autoincrement, " + "Libelle text, dateVisite date, dateLimite date, noteEtu float, noteDoss float, noteOral float, remarque text, sujMemoire text);";


    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
        db.execSQL(DATABASE_CREATE1
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version" + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS1);
    }
}

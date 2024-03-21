package com.example.myapplication.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_COMMENTS = "Etudiant";
    public static final String TABLE_COMMENTS1 = "Bilan";
    public static final String DATABASE_NAME = "AndroidFSI.db";
    private static final int DATABASE_VERSION = 1;
    
    public static final String COL_1 = "idEtu";
    public static final String COL_2 = "nom";
    public static final String COL_3 = "prenom";
    public static final String COL_4 = "adresse";
    public static final String COL_5 = "mail";
    public static final String COL_6 = "tel";
    public static final String COL_7 ="classe";
    public static final String COL_8 = "speci";
    ////////////////////////////////////////////
    public static final String COLL_1 ="idBilan";
    public static final String COLL_2 ="dateVisite";
    public static final String COLL_3 ="dateLimite";
    public static final String COLL_4 ="noteEnt";
    public static final String COLL_5 ="noteDoss";
    public static final String COLL_6 ="noteOral";
    public static final String COLL_7 ="remarque";
    public static final String COLL_8 ="sujMemoire";
    public static final String COLL_9 ="idEtu";





    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_COMMENTS + "(idEtu INTEGER PRIMARY KEY AUTOINCREMENT, nom TEXT, prenom TEXT, adresse TEXT, mail TEXT, tel TEXT, classe TEXT, speci TEXT)");
        db.execSQL("create table " + TABLE_COMMENTS1 + "(idBilan INTEGER PRIMARY KEY AUTOINCREMENT, dateVisite DATE, dateLimite DATE, noteEnt FLOAT, noteDoss FLOAT, noteOral FLOAT, remarque TEXT, sujMemoire TEXT, FOREIGN KEY(idEtu) REFERENCES Etudiant(idEtu))");
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


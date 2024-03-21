package com.example.myapplication.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ConnexionSQL {
    private MySQLiteHelper openHelper;
    private SQLiteDatabase db;
    Cursor curseur = null;

    public ConnexionSQL(Context context){
        openHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException{
        db = openHelper.getWritableDatabase();
    }
    public enum TableType{
        Etudiant, Bilan
    }

    public String info(TableType type){
        switch (type){
            case Etudiant:
                return openHelper.TABLE_COMMENTS;
            case Bilan:
                return openHelper.TABLE_COMMENTS1;
            default:
                return null;
        }
    }

    public void close(){
        openHelper.close();
    }
}

package com.example.lactemprature;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateTableLac extends SQLiteOpenHelper {
    private static final String TABLE_LAC = "tlac";
    static final String COL_ID = "_idLac";
    private static final String COL_NOM = "Nom";
    private static final String COL_POSITION = "Position";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_LAC + " ("+COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+ COL_NOM + " TEXT NOT NULL, " + COL_POSITION
            + " TEXT NOT NULL, );";

    //constructeur paramétré
    public CreateTableLac(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //méthodes d'instance permettant la gestion de l'objet
    @Override
    public void onCreate(SQLiteDatabase db) {
        //appelée lorsqu’aucune base n’existe et que la classe utilitaire doit en créer une
        // on créé la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_TABLE);
    }
    // appelée si la version de la base a changé
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut  supprimer la table et de la recréer
        db.execSQL("DROP TABLE " + TABLE_LAC + ";");
        onCreate(db);
    }
}




package com.example.lactemprature;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateTableReleve extends SQLiteOpenHelper {
    private static final String TABLE_RELEVE = "tlac";
    static final String COL_ID = "_idReleve";
    private static final String COL_MOIS = "Mois";
    private static final String COL_JOUR = "Jour";
    private static final String COL_TEMP1 = "Temp1";
    private static final String COL_TEMP2 = "Temp2";
    private static final String COL_TEMP3 = "Temp3";
    private static final String COL_TEMP4 = "Temp4";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_RELEVE + " ("+COL_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+ COL_MOIS + " TEXT NOT NULL, " + COL_JOUR
            + " TEXT NOT NULL,"+ COL_TEMP1 + " TEXT NOT NULL, "+ COL_TEMP2 + " TEXT NOT NULL, "+ COL_TEMP3 + " TEXT NOT NULL, "+ COL_TEMP4 + " TEXT NOT NULL);";

    //constructeur paramétré
    public CreateTableReleve(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
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
        db.execSQL("DROP TABLE " + TABLE_RELEVE + ";");
        onCreate(db);
    }
}
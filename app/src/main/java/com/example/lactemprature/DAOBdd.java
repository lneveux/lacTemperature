package com.example.lactemprature;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DAOBdd {
    static final int VERSION_BDD =1;
    private static final String NOM_BDD = "Edfv1.db";

    //TableLac
    static final String TABLE_LAC = "tlac";
    static final String COL_IDLAC = "_id";
    static final int NUM_COL_IDLAC = 0;
    static final String COL_NOM = "Nom;
    static final int NUM_COL_NOM = 1;
    static final String POSITION = "Position";
    static final int NUM_COL_POSITION = 2;

    //TableReleve
    private static final String TABLE_RELEVE = "tlac";
    static final String COL_ID = "_idReleve";
    static final int NUM_COL_ID = 0;
    static final String COL_MOIS = "Mois";
    static final int NUM_COL_MOIS = 1;
    static final String COL_JOUR = "Jour";
    static final int NUM_COL_JOUR = 2;
    static final String COL_TEMP1 = "Temp1";
    static final int NUM_COL_TEMP1 = 3;
    static final String COL_TEMP2 = "Temp2";
    static final int NUM_COL_TEMP2 = 4;
    static final String COL_TEMP3 = "Temp3";
    static final int NUM_COL_TEMP3 = 5;
    static final String COL_TEMP4 = "Temp4";
    static final int NUM_COL_TEMP4 = 6;
    private CreateBDD tableCourante;
    private Context context;
    private SQLiteDatabase db;

    //le constructeur

    public DAOBdd(Context context){
        this.context = context;
        tableCourante = new CreateBDD(context, NOM_BDD, null, VERSION_BDD);
    }

    //les méthodes d'instance

    public DAOBdd open(){
        db = tableCourante.getWritableDatabase();
        return this;
    }
    public DAOBdd close(){
        db.close();
        return null;
    }
    public long insererLac (Lac unLac){
        ContentValues values = new ContentValues();

        values.put(COL_ID, unLac.getid());
        values.put(COL_NOM, unLac.getNom());
        values.put(COL_POSITION, unLac.getPosition());

        return db.insert(TABLE_LAC, null, values);

    }



}

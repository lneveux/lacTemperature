package com.example.lactemprature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button saisirreleve = findViewById(R.id.saisirReleve);
        Button afficherreleve = findViewById(R.id.afficherReleve);
        Button moyennereleve = findViewById(R.id.moyenneReleve);
        View.OnClickListener ecouteur = new View.OnClickListener() {


            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.saisirReleve:
                        Intent intent1 = new Intent(MainActivity.this, saisirReleveActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.afficherReleve:
                        Intent intent2 = new Intent(MainActivity.this, afficherReleveActivity.class);
                        startActivity(intent2);//on affecte au bouton l'écouteurbtnNewReleve.setOnClickListener(ecouteur);btnListeClients.setOnClickListener(ecouteur);
                    case R.id.moyenneReleve:
                        Intent intent3 = new Intent(MainActivity.this, moyenneReleveActivity.class);
                        startActivity(intent3);
                        break;

                }


            }

            ;
        };
        saisirreleve.setOnClickListener(ecouteur);
        afficherreleve.setOnClickListener(ecouteur);
        moyennereleve.setOnClickListener(ecouteur);

    }
}

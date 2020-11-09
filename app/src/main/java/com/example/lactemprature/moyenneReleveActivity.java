package com.example.lactemprature;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class moyenneReleveActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.affichermoyennereleve);

        Button ButtonEnregistrer = findViewById(R.id.confirm_button);
        Button ButtonAnnuler = findViewById(R.id.retourAcceuil);

        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.confirm_button:

                        break;
                    case R.id.retourAcceuil:
                        finish();
                        break;
                }
            }
        };

        ButtonEnregistrer.setOnClickListener(ecouteur);
        ButtonAnnuler.setOnClickListener(ecouteur);
    }
}

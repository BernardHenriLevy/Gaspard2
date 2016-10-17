package com.example.blackcrows.izypark;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class OptionDeRecherche extends Activity {

   Button parAdresse=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    Intent i = getIntent();
    setContentView(R.layout.activity_option_de_recherche);

    parAdresse =(Button) findViewById(R.id.buttonParAdresse);
    parAdresse.setOnClickListener(parAdresseListener);

}


    private View.OnClickListener parAdresseListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(OptionDeRecherche.this, recherche_par_adresse1.class);
            startActivity(ActiviteeSuivante);
        }
    };

}
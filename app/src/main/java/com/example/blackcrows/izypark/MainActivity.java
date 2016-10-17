package com.example.blackcrows.izypark;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {


    Button connec=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recupere l'interface
        setContentView(R.layout.activity_main);

        // Recuperation des vues#IHM#Dagorret


        connec = (Button) findViewById(R.id.connec);

        connec.setOnClickListener(connecListener);

    }





    private OnClickListener connecListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(MainActivity.this, OptionDeRecherche.class);
            startActivity(ActiviteeSuivante);
        }
    };
}
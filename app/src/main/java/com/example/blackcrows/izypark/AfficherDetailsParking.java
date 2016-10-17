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

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

public class AfficherDetailsParking extends Activity {

    Button carte = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recupere l'interface

        Intent i = getIntent();
        setContentView(R.layout.activity_afficher_details_parking);

        carte =(Button) findViewById(R.id.detailParkingCarte);
        carte.setOnClickListener(carteListener);


    }


    private OnClickListener carteListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent ActiviteeSuivante = new Intent(AfficherDetailsParking.this, MapsActivity.class);
            startActivity(ActiviteeSuivante);
        }
    };

}
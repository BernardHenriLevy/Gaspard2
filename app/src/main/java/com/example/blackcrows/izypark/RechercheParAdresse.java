package com.example.blackcrows.izypark;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.TextView;


import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.TextBlock;

import java.util.List;

public class RechercheParAdresse extends Activity {
    TextView result=null;
    double latitude=0;
    double longitude=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche_par_adresse2);

        final Intent intent = getIntent();
        String message = intent.getStringExtra(recherche_par_adresse1.EXTRA_MESSAGE);

        getLocationFromAddress(getApplicationContext(),message);
        result = (TextView)findViewById(R.id.latResultat);
        result.setText(String.valueOf(latitude));

        result = (TextView)findViewById(R.id.lngResultat);
        result.setText(String.valueOf(longitude));
    }


    public LatLng getLocationFromAddress(Context context, String strAddress) {

        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude());
            latitude=p1.latitude;
            longitude=p1.longitude;

        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return p1;
    }
}



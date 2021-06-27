package com.example.locdemo;
import com.google.android.gms.maps.Googlemap;
import com.google.android.gms.maps.OnMapReadyCall;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment=SupportMapFagment.newInstance();
        getSupportFragmentManager().beginTransaction().replaceR.@+id/mapframe.mapframe,mapFragment);
mapFragment.getMapAsync();
if(ContextCompat)
    }
}
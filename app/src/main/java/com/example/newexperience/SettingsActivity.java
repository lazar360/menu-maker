package com.example.newexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent i = getIntent();
    }

    public void createMenu(View theView){

        ((TextView)findViewById(R.id.textView5)).setText("LundiSoir"); // LundiSoir
        ((TextView)findViewById(R.id.textView10)).setText("MardiSoir"); // MardiSoir
        ((TextView)findViewById(R.id.textView13)).setText("MercrediSoir"); // MercrediSoir
        ((TextView)findViewById(R.id.textView16)).setText("JeudiSoir"); // JeudiSoir
        ((TextView)findViewById(R.id.textView19)).setText("VendrediSoir"); // VendrediSoir
        ((TextView)findViewById(R.id.textView22)).setText("SamediMidi"); // SamediMidi
        ((TextView)findViewById(R.id.textView25)).setText("SamediSoir"); // SamediSoir
        ((TextView)findViewById(R.id.textView28)).setText("DimancheMidi"); // DimancheMidi
        ((TextView)findViewById(R.id.textView31)).setText("DimancheSoir"); // DimancheSoir
    }
}
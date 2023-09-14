package com.example.newexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent i = getIntent();
    }

    public void createMenu(View theView){

        // Algo de creation de menu
        int min = 1;
        int max = 9;
        int sizeRequired = 9;
        List<String> listOfDishesFull = Arrays.asList(
                "purée saucisse",
                "rôti de porc",
                "gratin dauphinois",
                "steak haché haricots verts",
                "côte de porc salsifis",
                "salade de gésiers",
                "couscous poulet curry",
                "bœuf aux oignons",
                "saucisse emmitouflée",
                "carotte saucisse",
                " ravioles sauce au pistou",
                "bavette à l'échalote",
                " poisson pané ratatouille",
                "tourte tomate"
        );

        List<String> listOfDishes = new ArrayList<>();
        Random random = new Random();
        Set<Integer> selectedIndices = new HashSet<>();

        while (listOfDishes.size() < sizeRequired) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(max - min + 1) + min - 1;
            } while (selectedIndices.contains(randomIndex));

            selectedIndices.add(randomIndex);
            listOfDishes.add(listOfDishesFull.get(randomIndex));
        }

        for (String dish : listOfDishes) {
            // System.out.println("plat : " + dish);
            Log.v("info", "plat : " + dish);
        }

        // Remplissage des champs affiches
        ((TextView)findViewById(R.id.textView5)).setText(listOfDishes.get(0)); // LundiSoir
        ((TextView)findViewById(R.id.textView10)).setText(listOfDishes.get(1)); // MardiSoir
        ((TextView)findViewById(R.id.textView13)).setText(listOfDishes.get(2)); // MercrediSoir
        ((TextView)findViewById(R.id.textView16)).setText(listOfDishes.get(3)); // JeudiSoir
        ((TextView)findViewById(R.id.textView19)).setText(listOfDishes.get(4)); // VendrediSoir
        ((TextView)findViewById(R.id.textView22)).setText(listOfDishes.get(5)); // SamediMidi
        ((TextView)findViewById(R.id.textView25)).setText(listOfDishes.get(6)); // SamediSoir
        ((TextView)findViewById(R.id.textView28)).setText(listOfDishes.get(7)); // DimancheMidi
        ((TextView)findViewById(R.id.textView31)).setText(listOfDishes.get(8)); // DimancheSoir
    }
}
package com.example.newexperience;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

       List<Item> items = Arrays.asList(
               new Item("purée saucisse", R.drawable.a ),
               new Item("rôti de porc", R.drawable.b ),
               new Item("gratin dauphinois", R.drawable.c ),
               new Item("steak haché haricots verts", R.drawable.d ),
               new Item("côte de porc salsifis", R.drawable.e ),
               new Item("salade de gésiers", R.drawable.f ),
               new Item("couscous poulet curry", R.drawable.g ),
               new Item("bœuf aux oignons", R.drawable.h ),
               new Item("saucisse emmitouflée", R.drawable.i ),
               new Item("carotte saucisse", R.drawable.a ),
               new Item(" ravioles sauce au pistou", R.drawable.b ),
               new Item("bavette à l'échalote", R.drawable.c ),
               new Item(" poisson pané ratatouille", R.drawable.d ),
               new Item("tourte tomate", R.drawable.e)
      );

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }

    public void launchMenuMaker(View v){
        // launch a new activity
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}
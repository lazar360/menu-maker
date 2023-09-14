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
               new Item("spaghettis bolognaise", R.drawable.b ),
               new Item("porc au caramel", R.drawable.c ),
               new Item("steak haché haricots verts", R.drawable.d ),
               new Item("brochettes de poulet", R.drawable.e ),
               new Item("salade de gésiers", R.drawable.f ),
               new Item("steack salade tomates", R.drawable.g ),
               new Item("lieu noir cuit au four", R.drawable.h ),
               new Item("saumon ratatouille", R.drawable.i ),
               new Item("couscous royal", R.drawable.a ),
               new Item("ravioles sauce au pistou", R.drawable.b ),
               new Item("spaghettis carbonara", R.drawable.c ),
               new Item("bavette à l'échalote", R.drawable.d ),
               new Item("brochettes au porc", R.drawable.e)
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
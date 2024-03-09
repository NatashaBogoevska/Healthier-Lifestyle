package com.example.healthierlifestyle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Exercises extends AppCompatActivity  {

    View view;
    RecyclerView eRecyclerView;
    ExerciseAdapter eAdapter;

    String[] exerciseLvl=null;
    TypedArray imagesE=null;
    public static class E{
        public static int j = 0;
        public static int counter = 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);



        eRecyclerView=(RecyclerView) findViewById(R.id.exLvls);
        eRecyclerView.setHasFixedSize(true);

        eRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        eRecyclerView.setItemAnimator(new DefaultItemAnimator());

        imagesE=getResources().obtainTypedArray(R.array.imagesE);
        exerciseLvl=getResources().getStringArray(R.array.exerciseLvl);

        eAdapter=new ExerciseAdapter(imagesE,exerciseLvl,R.layout.my_line,this);
        eRecyclerView.setAdapter(eAdapter);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.recipes) {
                    startActivity(new Intent(Exercises.this, Recipes.class));
                    return true;
                } else if (id == R.id.welcome) {
                    startActivity(new Intent(Exercises.this, Welcome.class));
                    return true;
                } else if (id == R.id.exercises) {
                    startActivity(new Intent(Exercises.this, Exercises.class));
                    return true;
                }

                return false;
            }

        });

    }
}
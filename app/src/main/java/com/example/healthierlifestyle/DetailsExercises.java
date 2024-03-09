package com.example.healthierlifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class DetailsExercises extends AppCompatActivity {

    String[] exercisesAll = {"30s High-tension plank\n10xDeadbug\n6xBear crawl\n10xSlow-motion mountain climbers\n5xReverse crunch\n5xV-sit Crunch",
            "10xBicep Curl\n10xChest Fly\n2x8 Tricep Extension\n2x10 Bent-Over Row\n5xBent-Over Reverse Fly\n5xLateral Raise",
            "10xPushup\n6xBarbell bench press\n5xMedicine ball chest throw\n6xFlat dumbbell bench press\n6xDecline dumbbell flye\n8xCable chest press\n5xIncline dumbbell bench press"};

    String[] timeAll = {"45min", "40min", "45min"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_exercises);

        Intent intent = getIntent();
        String level = intent.getStringExtra("level");
        Log.d("TitleDebug","Title received: "+level);

        String exText = "";
        String timeText = "";

        if(level!=null && level.equals("ABS-beginner")){
            exText=exercisesAll[0];
            timeText=timeAll[0];
        } else if(level!=null && level.equals("ARMS-beginner")){
            exText=exercisesAll[1];
            timeText=timeAll[1];
        } else if(level!=null && level.equals("CHEST-beginner")){
            exText=exercisesAll[2];
            timeText=timeAll[2];
        }

        TextView name = (TextView) findViewById(R.id.titleVezhbi);
        name.setText(level);
        TextView exer = (TextView) findViewById(R.id.vezhbi);
        exer.setText(exText);
        TextView vreme = (TextView) findViewById(R.id.vreme);
        vreme.setText(timeText);

    }
}
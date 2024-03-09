package com.example.healthierlifestyle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Welcome extends AppCompatActivity {

FirebaseAuth auth;
Button logO;
FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        auth=FirebaseAuth.getInstance();
        logO=(Button) findViewById(R.id.logOut);
        user=auth.getCurrentUser();//this will get the current user

        if(user==null){//if the user is null we will finish this activity and open the login activity
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
        else{
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int id = item.getItemId();

                    if (id == R.id.recipes) {
                        startActivity(new Intent(Welcome.this, Recipes.class));
                        return true;
                    } else if (id == R.id.welcome) {
                        startActivity(new Intent(Welcome.this, Welcome.class));
                        return true;
                    } else if (id == R.id.exercises) {
                        startActivity(new Intent(Welcome.this, Exercises.class));
                        return true;
                    }

                    return false;
                }

            });
        }

        logO.setOnClickListener(new View.OnClickListener(){//here we can sign out the user
            @Override
            public void onClick(View view){
                FirebaseAuth.getInstance().signOut();
                //we close the current activity and open the login activity
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
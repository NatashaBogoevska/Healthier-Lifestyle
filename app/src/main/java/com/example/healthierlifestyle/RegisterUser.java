package com.example.healthierlifestyle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterUser extends AppCompatActivity {

    EditText fname,lname,birth,age,emailR,passwordR;
    Button reg;
    FirebaseAuth mAuth;

    TextView textView;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent=new Intent(getApplicationContext(), Welcome.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);


        mAuth=FirebaseAuth.getInstance();
        fname=(EditText) findViewById(R.id.firstName);
        lname=(EditText) findViewById(R.id.lastName);
        birth=(EditText) findViewById(R.id.dateBirth);
        age=(EditText) findViewById(R.id.years);
        emailR=(EditText) findViewById(R.id.emailRegister);
        passwordR=(EditText) findViewById(R.id.passwordRegister);
        reg=(Button) findViewById(R.id.buttonRegister);
        textView=findViewById(R.id.registerNow);

        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();//finish the current activity
            }
        });

        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name,surname,dateB,email,pass;
                int years;
                name=String.valueOf(fname.getText());
                surname=String.valueOf(lname.getText());
                dateB=String.valueOf(birth.getText());
                email=String.valueOf(emailR.getText());
                pass=String.valueOf(passwordR.getText());
                years=Integer.parseInt(age.getText().toString());


                if(TextUtils.isEmpty(name)){
                    Toast.makeText(RegisterUser.this,"Enter a first name",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(surname)){
                    Toast.makeText(RegisterUser.this,"Enter a last name",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(dateB)){
                    Toast.makeText(RegisterUser.this,"Enter a date of birth",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(RegisterUser.this,"Enter an email",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(pass)){
                    Toast.makeText(RegisterUser.this,"Enter a password",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(years<=0){
                    Toast.makeText(RegisterUser.this,"Enter your age",Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email,pass)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    Toast.makeText(RegisterUser.this,"Account created",Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(RegisterUser.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });
    }
}
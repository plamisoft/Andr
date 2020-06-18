package com.example.dict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //правене на необходимите референции
    EditText e1,e2;
    Button b1,b2;
    DatabaseHelper db;
    public static String veremail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //референция за базата
        db = new DatabaseHelper(this);
        //слагане на ID на полетатат/бутоните от layout
        e1 = (EditText)findViewById(R.id.logEmail);
        e2 = (EditText)findViewById(R.id.logPass);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.backlogbut);
        //при настикане на b2 се връщаме в мейн активити чрез интент
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        //при настикане на b2 се взема въведената информация от полетата и се проверява дали има такъв регистриран user
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean checkmailpass = db.emailpassword(email,password);
                if (checkmailpass == true) {
                    Toast.makeText(getApplicationContext(), "successfully logged in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    i.putExtra("email",email);
                    startActivity(i);
                    veremail = email;
                }
                //ако няма измисва wrong email or password
                else
                    Toast.makeText(getApplicationContext(), "Wrong email or password", Toast.LENGTH_SHORT).show();
            }


        });



    }
}

package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
    }
    public void kembali(View view){
        Intent intent = new Intent(login.this, loginregis.class);
        startActivity(intent);
    }

    public void loginn (View view) {
        Intent Home = new Intent(login.this, home.class);
        startActivity(Home);
    }
}
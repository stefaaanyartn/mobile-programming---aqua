package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halamanktp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halamanktp);
    }
    public void balikan3 (View view) {
        Intent intent = new Intent(halamanktp.this, ekstravaganza.class);
        startActivity(intent);
    }
    public void submitscan3 (View view) {
        Intent intent = new Intent(halamanktp.this, home.class);
        startActivity(intent);
    }
    public void cancelscan3 (View view) {
        Intent intent = new Intent(halamanktp.this, ekstravaganza.class);
        startActivity(intent);
    }
}
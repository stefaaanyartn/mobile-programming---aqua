package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halamanredeen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halamanredeen);

    }
    public void balikan4 (View view){
        Intent intent = new Intent(halamanredeen.this, home.class);
        startActivity(intent);
    }
    public void travelokadiskon (View view){
        Intent intent = new Intent(halamanredeen.this, halamanvaganza.class);
        startActivity(intent);
    }
}
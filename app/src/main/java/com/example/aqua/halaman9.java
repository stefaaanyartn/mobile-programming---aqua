package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halaman9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman9);

    }
    public void balikan1 (View view) {
        Intent intent = new Intent(halaman9.this, halaman7.class);
        startActivity(intent);
    }
    public void submitscan1 (View view) {
        Intent intent = new Intent(halaman9.this, halaman10.class);
        startActivity(intent);
    }
    public void cancelscan1 (View view) {
        Intent intent = new Intent(halaman9.this, halaman7.class);
        startActivity(intent);
    }
}
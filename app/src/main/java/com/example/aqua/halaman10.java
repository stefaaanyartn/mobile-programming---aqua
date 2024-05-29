package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halaman10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman10);
    }
    public void balikan2 (View view) {
        Intent intent = new Intent(halaman10.this, halaman9.class);
        startActivity(intent);
    }
    public void savescantutupbotol (View view) {
        Intent intent = new Intent(halaman10.this, selamat.class);
        startActivity(intent);
    }
    public void cancelscan2 (View view) {
        Intent intent = new Intent(halaman10.this, halaman9.class);
        startActivity(intent);
    }
}
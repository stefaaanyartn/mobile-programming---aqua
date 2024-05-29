package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class halaman7 extends AppCompatActivity {

    ImageButton btnScanBarcode;
    private ActivityResultLauncher<Intent> scanBarcodeLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent nextIntent = new Intent(halaman7.this, halaman9.class);
                    startActivity(nextIntent);
                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_halaman7);
        btnScanBarcode = findViewById(R.id.scanan);

        btnScanBarcode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(halaman7.this, ScannedBarcodeActivity.class);
                scanBarcodeLauncher.launch(intent);
            }
        });

    }
    public void submitscan(View view) {
        Intent intent = new Intent(halaman7.this, halaman9.class);
        startActivity(intent);
    }
    public void cancelscan (View view) {
        Intent intent = new Intent(halaman7.this, home.class);
        startActivity(intent);
    }

}
package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class royalvaganza extends AppCompatActivity {
    private static final String [] sectors = {"1","2","3","4","5","6","7","8","9","10"};
    private static final int [] sectorsDegrees = new int[sectors.length];
    private static final Random random = new Random();
    private int degree = 0;
    private boolean isSpinning = false;

    private ImageView wheels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_royalvaganza);
        final ImageView panahredeemann = findViewById(R.id.panahredeemann);
        wheels = findViewById(R.id.wheels);

        getDegreeForSectors();

        panahredeemann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSpinning){
                    spin();
                    isSpinning= true;
                }
            }
        });

    }

    private void spin(){
        degree = random.nextInt(sectors.length-1);

        RotateAnimation rotateAnimation = new RotateAnimation(0, (360 * sectors.length) + sectorsDegrees[degree],
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setDuration(3600);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }


            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(royalvaganza.this, "Selamat Untuk Penukaran Pada Bulan Ini Senilai " +sectors[sectors.length - (degree + 1)] + " point.", Toast.LENGTH_SHORT).show();
                isSpinning = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });

        wheels.startAnimation(rotateAnimation);
    }
    public void balikan6 (View view){
        Intent intent = new Intent(royalvaganza.this, home.class);
        startActivity(intent);
    }
    public void submitroyalvaganza (View view){
        Intent intent = new Intent(royalvaganza.this, home.class);
        startActivity(intent);
    }

    private void getDegreeForSectors (){
        int sectorDegree = 360/ sectors.length;
        for (int i=0; i < sectors.length; i++){
            sectorsDegrees[i] = (i+1) * sectorDegree;
        }
    }
}
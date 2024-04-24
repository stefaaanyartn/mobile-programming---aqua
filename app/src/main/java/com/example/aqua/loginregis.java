package com.example.aqua;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class loginregis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginregis);

    } public void masuk(View v) {
        Intent intent = new Intent (loginregis.this, login.class);
        startActivity(intent);
    } public void masuk1 (View v) {
        Intent intent = new Intent (loginregis.this, regis.class);
        startActivity(intent);
    }
}
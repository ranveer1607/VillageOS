package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class adsplashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adsplashscreen);
        new android.os.Handler().postDelayed(() -> {
           Intent i=new Intent(adsplashscreen.this, Adminlogin.class);
           startActivity(i);
            finish();
        }, 3000);
    }
}
package com.example.villageos;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URL;

public class G_Scheme1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gscheme1);
        Button btn = findViewById(R.id.btn);

                btn.setOnClickListener(v -> {
                    Intent intent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://scholarships.gov.in/")
                    );
                    startActivity(intent);
                });

    }
}
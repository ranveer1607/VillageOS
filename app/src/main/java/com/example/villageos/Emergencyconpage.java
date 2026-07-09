package com.example.villageos;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.Manifest;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Emergencyconpage extends AppCompatActivity {
    TextView p1, a1, g1, f1 ,s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencyconpage);

            p1 = findViewById(R.id.p1);
            a1 = findViewById(R.id.a1);
            g1 = findViewById(R.id.g1);
            f1 = findViewById(R.id.f1);
            s1 = findViewById(R.id.s1);


            p1.setOnClickListener(v -> {
                makeCall("100");
            });


            a1.setOnClickListener(v -> {
                makeCall("108");
            });


            f1.setOnClickListener(v -> {
                makeCall("101");
            });


            s1.setOnClickListener(v -> {
                makeCall("9529251319");
            });

            g1.setOnClickListener(v -> {
            makeCall("9665244409");
        });

    }


        private void makeCall(String number){

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + number));

            if(ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CALL_PHONE},1);
                return;
            }

            startActivity(intent);
        }

    }

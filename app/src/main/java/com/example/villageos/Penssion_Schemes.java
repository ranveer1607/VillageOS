package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Penssion_Schemes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_penssion_schemes);
        LinearLayout p1=findViewById(R.id.p1);
        LinearLayout p2=findViewById(R.id.p2);
        LinearLayout p3=findViewById(R.id.p3);
        LinearLayout p4=findViewById(R.id.p4);
        LinearLayout p5=findViewById(R.id.p5);
        LinearLayout p6=findViewById(R.id.p6);
        LinearLayout p7=findViewById(R.id.p7);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Penssion_Schemes.this, Farmer1.class);
                startActivity(i);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Penssion_Schemes.this, Farmer2.class);
                startActivity(i2);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(Penssion_Schemes.this, Farmer3.class);
                startActivity(i3);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(Penssion_Schemes.this, Farmer4.class);
                startActivity(i4);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(Penssion_Schemes.this, Farmer5.class);
                startActivity(i5);
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6= new Intent(Penssion_Schemes.this, Farmer6.class);
                startActivity(i6);
            }
        });
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7= new Intent(Penssion_Schemes.this, Farmer7.class);
                startActivity(i7);
            }
        });

    }
}
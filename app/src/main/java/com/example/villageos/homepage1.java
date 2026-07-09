package com.example.villageos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.util.MeasureUnit;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homepage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);
        TextView w1=findViewById(R.id.w1);
        ImageButton ib1 = findViewById(R.id.ib1);
        ImageButton ib2 = findViewById(R.id.ib2);
        ImageButton ib3 = findViewById(R.id.ib3);
        ImageButton ib4 = findViewById(R.id.ib4);
        ImageButton ib5= findViewById(R.id.ib5);
        ImageButton ib6 = findViewById(R.id.ib6);
        Intent i=getIntent();
        String b=i.getStringExtra("NAME");
        w1.setText("Welcome \n"+b);
         ib1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(homepage1.this,schemes.class);
                 startActivity(i);
             }
         });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(homepage1.this,event_management.class);
                startActivity(i2);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(homepage1.this,Emergencyconpage.class);
                startActivity(i3);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(homepage1.this,healthcare.class);
                startActivity(i4);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(homepage1.this,noticeboard.class);
                startActivity(i5);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(homepage1.this,complentpage.class);
                startActivity(i6);
            }
        });



        ImageButton menuBtn = findViewById(R.id.menuBtn);

        menuBtn.setOnClickListener(v -> {

            PopupMenu popupMenu = new PopupMenu(homepage1.this, menuBtn);

            popupMenu.getMenuInflater().inflate(R.menu.menufile,
                    popupMenu.getMenu());

            popupMenu.show();
        });

          BottomNavigationView bt = findViewById(R.id.bt);

        bt.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.h1) {
                startActivity(new Intent(homepage1.this, homepage1.class));
                return true;
            }

            if (item.getItemId() == R.id.c1) {
                startActivity(new Intent(homepage1.this, complentpage.class));
                return true;
            }

            if (item.getItemId() == R.id.p1) {
                startActivity(new Intent(homepage1.this, profilepage.class));
                return true;
            }

            return false;
        });
    }
}
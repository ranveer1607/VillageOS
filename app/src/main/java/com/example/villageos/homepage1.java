package com.example.villageos;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.util.MeasureUnit;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.Manifest;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homepage1 extends AppCompatActivity {
    TextView quoteText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);
        TextView w1=findViewById(R.id.w1);
        Intent i=getIntent();
        String b=i.getStringExtra("NAME");
        w1.setText("Welcome \n"+b);
        quoteText = findViewById(R.id.quoteText);

        setDailyQuote();

        ImageButton ib1 = findViewById(R.id.ib1);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(homepage1.this,schemes.class);
                startActivity(i11);
            }
        });

        ImageButton ib2 = findViewById(R.id.ib2);

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i22 = new Intent(homepage1.this,Eventpage.class);
                startActivity(i22);

            }
        });

        ImageButton ib3 = findViewById(R.id.ib3);

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i33 = new Intent(homepage1.this, Emergencyconpage.class);
                startActivity(i33);

            }
        });


        ImageButton ib4 = findViewById(R.id.ib4);

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i44 = new Intent(homepage1.this, healthcare.class);
                startActivity(i44);

            }
        });

        ImageButton ib5 = findViewById(R.id.ib5);

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i55 = new Intent(homepage1.this, noticeboard.class);
                startActivity(i55);

            }
        });

        ImageButton ib6 = findViewById(R.id.ib6);

        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i66 = new Intent(homepage1.this, complaintmanagementpage.class);
                startActivity(i66);

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

    private void setDailyQuote(){

        String[] quotes = {

                "Our village, our responsibility, our pride.",

                "Together we grow, together we build a better village.",

                "Clean village, healthy village.",

                "Unity of villagers creates the strength of a village.",

                "Small efforts today create a developed village tomorrow.",

                "A smart village starts with smart thinking.",

                "The progress of a village depends on the unity of its people.",

                "Every change begins with a small step.",

                "Strong villages create a strong nation.",

                "Save water, protect nature, build a better future.",

                "A peaceful village is the foundation of a happy life.",

                "Development comes when everyone participates.",

                "Together we can make our village better.",

                "Respect nature, respect culture, respect our village.",

                "The beauty of a village lies in its unity.",

                "Dream big, work together, develop together.",

                "A clean village is a healthy village.",

                "Our village, our future.",

                "Technology and tradition together create a smart village.",

                "Be the change you want to see in your village."

        };


        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_YEAR);


        int index = day % quotes.length;


        quoteText.setText("💡 Today's Thought\n\n\"" + quotes[index] + "\"");

    }
}
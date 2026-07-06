package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Method;

public class profilepage extends AppCompatActivity {
DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);
        EditText e4=findViewById(R.id.e4);
        EditText e3=findViewById(R.id.e3);
        Intent i = getIntent();
        String b = i.getStringExtra("NAME");
        e3.setText(b);

        db= FirebaseDatabase.getInstance().getReference("new user");
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    String u1 = ds.child("a").getValue(String.class);
                     String m1 = ds.child("b").getValue(String.class);

                        e3.setText(u1);
                        e4.setText(m1);

                }


                TextView t10 = findViewById(R.id.t10);
                t10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(profilepage.this, complentpage.class);
                        startActivity(i);
                    }
                });
                TextView t20 = findViewById(R.id.t20);
                t20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(profilepage.this, feedback.class);
                        startActivity(i1);
                    }
                });
                TextView t40 = findViewById(R.id.t40);
                t40.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(profilepage.this, Emergencyconpage.class);
                        startActivity(i2);
                    }
                });

                TextView l1=findViewById(R.id.l1);
                l1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3= new Intent(profilepage.this, Mainpage.class);
                        startActivity(i3);

                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    ;}}
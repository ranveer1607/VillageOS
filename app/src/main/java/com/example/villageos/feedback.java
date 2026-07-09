package com.example.villageos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class feedback extends AppCompatActivity {
    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        RatingBar r1=findViewById(R.id.r1);
        EditText es=findViewById(R.id.es);
        EditText n1=findViewById(R.id.n1);
        Button btn=findViewById(R.id.btn);
        db= FirebaseDatabase.getInstance().getReference("Feedbackform");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NAME=n1.getText().toString();
                String RATE=""+r1.getRating();
                String SUGG=es.getText().toString();
                form f=new form(NAME,RATE,SUGG);
                String uid=db.push().getKey();
                db.child(uid).setValue(f).addOnSuccessListener(unused -> Toast.makeText(feedback.this, "Store", Toast.LENGTH_LONG).show()).addOnFailureListener(e -> Toast.makeText(feedback.this, "Fail", Toast.LENGTH_LONG).show());

            }
        });


    }
}
package com.example.villageos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class dataex extends AppCompatActivity {
    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticeboard);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        Button b1=findViewById(R.id.b1);
        db= FirebaseDatabase.getInstance().getReference("Information");


    }
}
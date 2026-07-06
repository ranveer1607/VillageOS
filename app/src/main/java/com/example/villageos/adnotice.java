package com.example.villageos;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class adnotice extends AppCompatActivity {
            DatabaseReference db;

            ArrayList<String> list;
            ArrayAdapter adapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_adnotice);

                EditText e1 = findViewById(R.id.e1);
                EditText e2 = findViewById(R.id.e2);
                Button b1 = findViewById(R.id.b1);

                db = FirebaseDatabase.getInstance().getReference("Notices");

                b1.setOnClickListener(v -> {

                    String title = e1.getText().toString().trim();
                    String desc = e2.getText().toString().trim();

                    if (title.isEmpty() || desc.isEmpty()) {
                        Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    String id = db.push().getKey();

                    String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

                    NoticeModel nm = new NoticeModel(title, desc, date);

                    db.child(id).setValue(nm);

                    e1.setText("");
                    e2.setText("");

                    Toast.makeText(this, "Notice Published", Toast.LENGTH_SHORT).show();
                });
            }
            }


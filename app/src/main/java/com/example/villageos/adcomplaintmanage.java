package com.example.villageos;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

import java.util.ArrayList;

public class adcomplaintmanage extends AppCompatActivity {

        DatabaseReference db;
        ArrayList<String> list;
        ArrayAdapter adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_adcomplaintmanage);

            ListView l1=findViewById(R.id.l1);

            list = new ArrayList<>();

            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);

            l1.setAdapter(adapter);

            db = FirebaseDatabase.getInstance().getReference("Complaints");

            db.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    list.clear();

                    for (DataSnapshot ds : snapshot.getChildren()) {

                        String type = ds.child("type").getValue(String.class);
                        String desc = ds.child("desc").getValue(String.class);

                        list.add("Type: " + type + "\nComplaint: " + desc);
                    }

                    adapter.notifyDataSetChanged();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }
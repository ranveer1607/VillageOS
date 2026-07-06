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

public class adfeedback extends AppCompatActivity {
    DatabaseReference db;
    ArrayList<String> arr;
    ArrayAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adfeedback);
        ListView l1=findViewById(R.id.l1);
        db= FirebaseDatabase.getInstance().getReference("Feedbackform");
        arr=new ArrayList<>();
        ad=new ArrayAdapter(adfeedback.this, android.R.layout.simple_list_item_1,arr);
        l1.setAdapter(ad);

        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds : snapshot.getChildren()) {

                    String RATE = ds.child("rate").getValue(String.class);
                    String SUGG = ds.child("sugg").getValue(String.class);

                    arr.add("RATE: " + RATE + "\nSUGGETION:" + SUGG);
                }

                ad.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });
    }
}

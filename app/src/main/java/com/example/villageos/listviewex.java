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

public class listviewex extends AppCompatActivity {
DatabaseReference db;
ArrayList<String> arr;
ArrayAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewex);
        ListView lv=findViewById(R.id.lv);
        db= FirebaseDatabase.getInstance().getReference("Feedbackform");
        arr=new ArrayList<>();
        ad=new ArrayAdapter(listviewex.this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(ad);
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot ds:snapshot.getChildren()) {
                    String NAME = ds.child("name").getValue(String.class);
                    String RATE = ds.child("rate").getValue(String.class);
                    String SUGG = ds.child("sugg").getValue(String.class);
                    String data = "NAME="+NAME +"\nRATE=" + RATE+"\nSuggetion="+SUGG;
                    arr.add(data);
                }
                ad.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}


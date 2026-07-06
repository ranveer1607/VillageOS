package com.example.villageos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

public class noticeboard extends AppCompatActivity {
    DatabaseReference db;
    ArrayList<String> arr;
    ArrayAdapter ad;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_noticeboard);
            ListView l1=findViewById(R.id.l1);
            db= FirebaseDatabase.getInstance().getReference("NoticeModel");
            arr=new ArrayList<>();
            ad=new ArrayAdapter(noticeboard.this, android.R.layout.simple_list_item_1,arr);
            l1.setAdapter(ad);

            db = FirebaseDatabase.getInstance().getReference("Notices");

            db.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    for (DataSnapshot ds : snapshot.getChildren()) {

                        String title = ds.child("title").getValue(String.class);
                        String desc = ds.child("desc").getValue(String.class);
                        String date = ds.child("date").getValue(String.class);

                        arr.add("📢 " + title + "\n" + desc + "\n📅 " + date);
                    }

                    ad.notifyDataSetChanged();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {}
            });
        }
}
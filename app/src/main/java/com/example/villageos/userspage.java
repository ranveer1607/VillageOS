package com.example.villageos;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
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

public class userspage extends AppCompatActivity {
    DatabaseReference db;
    ArrayList<String> arr;
    ArrayAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userspage);
        ListView l1=findViewById(R.id.l1);
        db= FirebaseDatabase.getInstance().getReference("new user");

        arr=new ArrayList<>();
        ad=new ArrayAdapter(userspage.this, android.R.layout.simple_list_item_1,arr);
        l1.setAdapter(ad);
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot ds:snapshot.getChildren()) {
                    String n = ds.child("a").getValue(String.class);
                    String m = ds.child("b").getValue(String.class);
                    String p = ds.child("d").getValue(String.class);

                    String data = "Name=" + n + "\nMobile No=" + m + "\nPassword=" + p ;
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






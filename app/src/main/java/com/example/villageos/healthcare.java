package com.example.villageos;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;



public class healthcare extends AppCompatActivity {


    Button btnAmbulance;

    RecyclerView healthCampRecycler;


    ArrayList<healthmodel> list;


    healthadadapter adapter;


    DatabaseReference db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_healthcare);



        // Ambulance Call Button

        btnAmbulance = findViewById(R.id.btnAmbulance);


        btnAmbulance.setOnClickListener(v -> {


            Intent callIntent = new Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:108")
            );


            startActivity(callIntent);


        });




        // RecyclerView

        healthCampRecycler = findViewById(R.id.healthCampRecycler);



        healthCampRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        list = new ArrayList<>();


        adapter = new healthadadapter(list);


        healthCampRecycler.setAdapter(adapter);




        // Firebase Database

        db = FirebaseDatabase.getInstance()
                .getReference("HealthCamps");




        db.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                list.clear();



                for(DataSnapshot ds : snapshot.getChildren()){


                    healthmodel model =
                            ds.getValue(healthmodel.class);



                    list.add(model);

                }



                adapter.notifyDataSetChanged();


            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {


            }


        });



    }


}
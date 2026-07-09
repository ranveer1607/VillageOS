package com.example.villageos;

import android.os.Bundle;

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

public class Eventpage extends AppCompatActivity {

    RecyclerView recyclerEvents;

    ArrayList<Events> eventList;
    Eventadapter adapter;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventpage);


        recyclerEvents = findViewById(R.id.recyclerEvents);

        recyclerEvents.setLayoutManager(new LinearLayoutManager(this));


        eventList = new ArrayList<>();

        adapter = new Eventadapter(eventList);

        recyclerEvents.setAdapter(adapter);


        reference = FirebaseDatabase.getInstance()
                .getReference("Events");


        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                eventList.clear();

                for(DataSnapshot ds : snapshot.getChildren()){

                    Events model = ds.getValue(Events.class);

                    if(model != null){
                        eventList.add(model);
                    }
                }

                adapter.notifyDataSetChanged();
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
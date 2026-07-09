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


public class noticeboard extends AppCompatActivity {


    DatabaseReference db;

    RecyclerView recyclerView;

    ArrayList<NoticeModel> noticeList;

    noticeAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_noticeboard);



        recyclerView = findViewById(R.id.noticeRecycler);



        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );



        noticeList = new ArrayList<>();


        adapter = new noticeAdapter(noticeList);


        recyclerView.setAdapter(adapter);



        db = FirebaseDatabase.getInstance()
                .getReference("Notices");



        db.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                noticeList.clear();



                for(DataSnapshot ds : snapshot.getChildren()){


                    NoticeModel model =
                            ds.getValue(NoticeModel.class);



                    noticeList.add(model);

                }



                adapter.notifyDataSetChanged();

            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }


        });


    }

}
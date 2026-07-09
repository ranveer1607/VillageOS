package com.example.villageos;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.ByteArrayOutputStream;


public class complentpage extends AppCompatActivity {


    Spinner s1;
    EditText d1;
    Button btn;
    ImageView c1;

    DatabaseReference db;

    Bitmap selectedBitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_complentpage);


        s1 = findViewById(R.id.s1);
        d1 = findViewById(R.id.d1);
        btn = findViewById(R.id.btn);
        c1 = findViewById(R.id.c1);



        String[] complaint = {

                "Select Complaint",
                "Water Supply Issue",
                "Electricity Issue",
                "Road Damage",
                "Cleanliness Issue",
                "Street Light Not Working",
                "Sewage Problem",
                "Health Care Issue",
                "Education Issue",
                "Other"

        };


        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        complaint
                );


        s1.setAdapter(adapter);



        db = FirebaseDatabase.getInstance()
                .getReference("Complaints");




        // Gallery Open

        c1.setOnClickListener(v -> {


            Intent intent =
                    new Intent(Intent.ACTION_PICK);

            intent.setType("image/*");

            startActivityForResult(intent,101);


        });





        // Submit Complaint

        btn.setOnClickListener(v -> {


            String type =
                    s1.getSelectedItem().toString();


            String desc =
                    d1.getText().toString().trim();



            if(desc.isEmpty()){

                Toast.makeText(this,
                        "Enter Description",
                        Toast.LENGTH_SHORT).show();

                return;

            }



            String image="";


            if(selectedBitmap != null){

                image = imageToBase64(selectedBitmap);

            }




            String id =
                    db.push().getKey();



            ComplaintModel cm =
                    new ComplaintModel(
                            type,
                            desc,
                            image
                    );



            db.child(id)
                    .setValue(cm);



            Toast.makeText(this,
                    "Complaint Submitted",
                    Toast.LENGTH_SHORT).show();



            d1.setText("");

            c1.setImageResource(R.drawable.camera2);

            selectedBitmap=null;


        });


    }




    // Gallery Image Result

    @Override
    protected void onActivityResult(
            int requestCode,
            int resultCode,
            Intent data) {


        super.onActivityResult(
                requestCode,
                resultCode,
                data);



        if(requestCode == 101 &&
                resultCode == RESULT_OK &&
                data != null){



            Uri uri =
                    data.getData();


            try {


                selectedBitmap =
                        MediaStore.Images.Media.getBitmap(
                                getContentResolver(),
                                uri
                        );


                c1.setImageBitmap(selectedBitmap);



            }catch(Exception e){

                e.printStackTrace();

            }


        }


    }





    // Image Convert Base64

    private String imageToBase64(Bitmap bitmap){


        ByteArrayOutputStream baos =
                new ByteArrayOutputStream();



        bitmap.compress(
                Bitmap.CompressFormat.JPEG,
                50,
                baos
        );



        byte[] imageBytes =
                baos.toByteArray();



        return Base64.encodeToString(
                imageBytes,
                Base64.DEFAULT
        );

    }


}
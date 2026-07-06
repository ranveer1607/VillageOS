package com.example.villageos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gramsabhanotice extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramsabhanotice);

        t1 = findViewById(R.id.t1);

        String notice = "All villagers are informed that a Gram Sabha Meeting "
                + "will be held on 10 July 2026 at 11:00 AM in the Gram Panchayat Hall.\n\n"

                + "Agenda:\n"
                + "• Village Development\n"
                + "• Water Supply\n"
                + "• Road Repair\n"
                + "• Government Schemes\n\n"

                + "All villagers are requested to attend.\n\n"

                + "Regards,\n"
                + "Gram Panchayat";

        t1.setText(notice);
    }
}
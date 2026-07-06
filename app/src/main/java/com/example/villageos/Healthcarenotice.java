package com.example.villageos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Healthcarenotice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcarenotice);
        TextView t3=findViewById(R.id.t3);
        String notice="Health Care Notice\n" +
                "Date: 18 July 2026\n" +
                "Notice:\n" +
                "A Free Health Check-up Camp will be organized on 18 July 2026 from 9:00 AM to 2:00 PM at the Primary Health Centre. All villagers are requested to attend and bring their health records if available.\n" +
                "– Health Department";
        t3.setText(notice);
    }
}
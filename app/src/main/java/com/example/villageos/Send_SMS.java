package com.example.villageos;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Send_SMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_send_sms);
        EditText sms=findViewById(R.id.sms);
        EditText etSuggestion=findViewById(R.id.etSuggestion);
        Button btn=findViewById(R.id.btn);
        if (checkPermission(android.Manifest.permission.SEND_SMS))
        {
            btn.setEnabled(true);
        }
        else {
            ActivityCompat.requestPermissions(Send_SMS.this,
                    new String[]{android.Manifest.permission.SEND_SMS}, 1);

        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg1=sms.getText().toString();
                String msg2=etSuggestion.getText().toString();
                Intent i=new Intent();
                PendingIntent pi= PendingIntent.getActivity(Send_SMS.this,
                        0,i,PendingIntent.FLAG_IMMUTABLE);
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(msg1, null, msg2, pi,null);

                Toast.makeText(Send_SMS.this, "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();

            }
        });

    }
    public boolean checkPermission(String permission) {
        int check = ContextCompat.checkSelfPermission
                (this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}




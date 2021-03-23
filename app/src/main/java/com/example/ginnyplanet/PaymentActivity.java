package com.example.ginnyplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {
    Button btncont;
    TextView customtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btncont= findViewById(R.id.cont);
        customtoolbar= findViewById(R.id.customtoolbar);
        customtoolbar.setText("Payment");

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PaymentActivity.this,Feedback.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.ginnyplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    TextView forgetp, login;
    EditText phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = findViewById(R.id.btnsubmit);
        forgetp = findViewById(R.id.forget);
        login = findViewById(R.id.login);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
               Intent intent= new Intent(MainActivity.this,PaymentActivity.class);
               startActivity(intent);
            }
        });
    }
}
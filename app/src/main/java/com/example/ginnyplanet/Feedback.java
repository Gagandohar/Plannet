package com.example.ginnyplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {
    TextView customtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        customtoolbar= findViewById(R.id.customtoolbar);
        customtoolbar.setText("Feedback");
    }
}
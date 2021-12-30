package com.shsnk.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        TextView txt = findViewById(R.id.textViewer);
        txt.setText("Welcome " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}
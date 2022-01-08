package com.shsnk.ui_uxlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.textViewButton);
        btn2=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Registration Button Clicked", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Additional functionality still need to be provide", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login BUtton Clicked", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Additional functionality still need to be provide", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
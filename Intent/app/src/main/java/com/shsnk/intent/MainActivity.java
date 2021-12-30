package com.shsnk.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        txt=findViewById(R.id.editText);
        String str = txt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,str);
        startActivity(intent);
    }
    Button btn;
    EditText txt;
    public static final String EXTRA_MESSAGE = "com.shsnk.intent.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(this);
    }
}
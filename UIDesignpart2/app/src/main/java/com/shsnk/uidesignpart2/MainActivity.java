package com.shsnk.uidesignpart2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn:
                showtext.setText(inputField.getText());
                Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();
                break;
            case R.id.inputField:
                Toast.makeText(this, "Try to Write Something", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
    protected EditText inputField;
    protected TextView showtext;
    protected Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputField=findViewById(R.id.inputField);
        showtext=findViewById(R.id.showtext);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
        inputField.setOnClickListener(this);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Release Button", Toast.LENGTH_SHORT).show();
                return true;//it's default came false but we have to change it to true for properly work with it

            }
        });
    }
}
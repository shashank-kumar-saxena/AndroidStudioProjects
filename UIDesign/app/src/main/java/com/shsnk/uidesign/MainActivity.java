package com.shsnk.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMsg(View v)
    {
        TextView msg=findViewById(R.id.helloTxt);
        msg.setText("Hello Button Clicked");
    }
}
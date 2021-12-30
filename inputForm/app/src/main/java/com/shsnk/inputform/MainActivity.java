package com.shsnk.inputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDetails(View view)
    {
        EditText iName= findViewById(R.id.iName);
        EditText iSName= findViewById(R.id.iSName);
        EditText iMail= findViewById(R.id.iMail);
        TextView oName= findViewById(R.id.oName);
        TextView oSName= findViewById(R.id.oSName);
        TextView oMail= findViewById(R.id.oMail);
        oName.setText("Name : "+iName.getText().toString());
        oSName.setText("Name : "+iSName.getText().toString());
        oMail.setText("Name : "+iMail.getText().toString());
    }
}
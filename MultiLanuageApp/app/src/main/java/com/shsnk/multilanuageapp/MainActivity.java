package com.shsnk.multilanuageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHello=findViewById(R.id.TxtView);
        txtHello.setText(getString(R.string.hello));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();//IT's like findViewById() Method
         inflater.inflate(R.menu.main_menu,menu);
         return true;
    }
    //Click listener For option item selected

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.settingBtn:
                Toast.makeText(this, "Setting Button Click", Toast.LENGTH_SHORT).show();
                return true; // we Return true instead of break;
            case R.id.alarmBtn:
                Toast.makeText(this,"ALarm set",Toast.LENGTH_SHORT).show();
            return true;
            case R.id.optionBtn:
                Toast.makeText(this,"ALarm set",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
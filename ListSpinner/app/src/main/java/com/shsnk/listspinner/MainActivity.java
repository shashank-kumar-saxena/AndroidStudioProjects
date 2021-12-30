package com.shsnk.listspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private Spinner citiesName;
    private ListView Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesName = findViewById(R.id.City);
        // if we using define data in string.xml file then we don't need the ArrayAdapter
        //--------------Here a exaample of arrayAdapter if data define in arrayList----------------
        //        ArrayAdapter<String> AdapterCity=new ArrayAdapter<>(
        //          this, android.R.layout.simple_spinner_dropdown_item,
        //          citiesName.
        //        );
        citiesName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,citiesName.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //list view
        Name=findViewById(R.id.Name);
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Shashank");
        nameList.add("Akshit");
        nameList.add("Ashish");
        nameList.add("Prince");
        nameList.add("Ashu");
        nameList.add("Nihal");
        ArrayAdapter<String> adapterName=new ArrayAdapter<>(
          this,
          android.R.layout.simple_list_item_1,
                nameList
        );
        Name.setAdapter(adapterName);
        Name.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, nameList.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
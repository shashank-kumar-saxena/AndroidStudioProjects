package com.shsnk.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecView = findViewById(R.id.RecView);
        ArrayList<Names> names =new ArrayList<>();
        names.add(new Names("java"));
        names.add(new Names("javascript"));
        names.add(new Names("HtMl"));
        names.add(new Names("css"));
        names.add(new Names("koltin"));
        RecViewEx Rec = new RecViewEx(this);
        Rec.setNames(names);
        RecView.setAdapter(Rec);
        RecView.setLayoutManager(new LinearLayoutManager(this));
    }
}
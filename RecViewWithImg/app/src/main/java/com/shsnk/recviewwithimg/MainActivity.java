package com.shsnk.recviewwithimg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecView=findViewById(R.id.RecView);
        ArrayList<Content> contents=new ArrayList<>();
        contents.add(new Content("Shashank","shashanksaxena226@gmail.com","https://pbs.twimg.com/profile_images/573984336271122432/k8vEBoCW.jpeg"));
        contents.add(new Content("Ashu","shashanksaxena226@gmail.com","https://pbs.twimg.com/profile_images/573984336271122432/k8vEBoCW.jpeg"));
        contents.add(new Content("Ashish","shashanksaxena226@gmail.com","https://pbs.twimg.com/profile_images/573984336271122432/k8vEBoCW.jpeg"));
        RecViewAdapter adapter=new RecViewAdapter(this);
        adapter.setContents(contents);
        RecView.setAdapter(adapter);
        RecView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
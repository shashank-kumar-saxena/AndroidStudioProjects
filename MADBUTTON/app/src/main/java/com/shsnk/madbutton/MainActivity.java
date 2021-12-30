package com.shsnk.madbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private int i=0;
    private Button Button1;
    private ExtendedFloatingActionButton Ebtn;
    private MaterialButtonToggleGroup btn;
    private FloatingActionButton fbtn1,fbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1=findViewById(R.id.buttonTextButton);
        btn=findViewById(R.id.btnToggle);
        btn.addOnButtonCheckedListener((group, checkedId, isChecked) ->
                {
                    if(isChecked)
                    {
                        switch (checkedId)
                        {
                            case R.id.tBtn1:
                                Toast.makeText(this, "Android Selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.tBtn2:
                                Toast.makeText(this, "IOS selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.tBtn3:
                                Toast.makeText(this, "Flutter Selected", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                break;
                        }
                    }
                }
                );

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();
            }
        });


        fbtn1=findViewById(R.id.floating_action_button_1);
        fbtn2=findViewById(R.id.floating_action_button_2);
        Ebtn=findViewById(R.id.Fbtn);
        fbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add Button Click", Toast.LENGTH_SHORT).show();
                if(i%2==0) {
                    fbtn2.hide();
                    Ebtn.shrink();
                }
                else {
                    fbtn2.show();
                    Ebtn.extend();
                }
                i++;
            }
        });
    }
}
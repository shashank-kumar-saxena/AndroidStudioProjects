package com.shsnk.uidesignpart3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId())
        {
            case R.id.phycheck:
                if(isChecked)   //it hold the value of true if box checked and false if box is not checked
                {
                    Toast.makeText(this, "You Checked Python Box", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(this, "You Unchecked Python Box", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jscheck:
                if(isChecked)   //it hold the value of true if box checked and false if box is not checked
                {
                    Toast.makeText(this, "You Checked JavaScript Box", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(this, "You Unchecked Javascript Box", Toast.LENGTH_SHORT).show();
                break;
            case R.id.andcheck:
                if(isChecked)   //it hold the value of true if box checked and false if box is not checked
                {
                    Toast.makeText(this, "You Checked Android Box", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(this, "You Unchecked Android Box", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
     RadioButton Single;
    RadioGroup radiobtn;
    CheckBox phy,js,and;
    ProgressBar bar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phy=findViewById(R.id.phycheck);
        js=findViewById(R.id.jscheck);
        and=findViewById(R.id.andcheck);
        phy.setOnCheckedChangeListener(this);
        js.setOnCheckedChangeListener(this);
        and.setOnCheckedChangeListener(this);
        phy.setChecked(true);//-----"set"------ this method is used for set value of XML files
        if(phy.isChecked())
        {
            Toast.makeText(this, "You Checked Python Box", Toast.LENGTH_SHORT).show();
        }
        if(js.isChecked())   //it hold the value of true if box checked and false if box is not checked
        {
            Toast.makeText(this, "You Checked JavaScript Box", Toast.LENGTH_SHORT).show();
        }
        if(and.isChecked())   //it hold the value of true if box checked and false if box is not checked
        {
            Toast.makeText(this, "You Checked Android Box", Toast.LENGTH_SHORT).show();
        }

        Single=findViewById(R.id.Single);
        radiobtn=findViewById(R.id.RadioBtn);
        Single.setChecked(true);
        int id=radiobtn.getCheckedRadioButtonId();
        switch(id)
        {
            case R.id.Single:
                Toast.makeText(MainActivity.this, "Single Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.married:
                Toast.makeText(MainActivity.this, "Married Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relation:
                Toast.makeText(MainActivity.this, "RelationShip Checked", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
        radiobtn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.Single:
                            Toast.makeText(MainActivity.this, "Single Checked", Toast.LENGTH_SHORT).show();
                            break;
                    case R.id.married:
                        Toast.makeText(MainActivity.this, "Married Checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.relation:
                        Toast.makeText(MainActivity.this, "RelationShip Checked", Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }
        });
        bar2=findViewById(R.id.pgbar2);

        Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for(i=0;i<20;i++)
                    {
                        bar2.incrementProgressBy(5);
                        SystemClock.sleep(500);//It's an android studio inbuilt exception handler
                    }
                    //Here exception occur
                    try {
                        if(i==20)
                        {
                            bar2.setVisibility(View.INVISIBLE);//note Use Invisible Instead of GONE
                        }
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                        System.out.println(i);
                    }
                }
            });
        thread.start();

    }
}
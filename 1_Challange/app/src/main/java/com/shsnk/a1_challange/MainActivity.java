package com.shsnk.a1_challange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {

       String s=password.getText().toString();
       String st=rePassword.getText().toString();
        int com=st.compareTo(s);//return 0 if string is equal
        if(com==0) {
           if (name.getText().toString().length() <= 0) {
               Toast.makeText(this, "Enter the name first", Toast.LENGTH_SHORT).show();
           } else if (email.getText().toString().length() <= 0) {
               Toast.makeText(this, "Enter the valid email address", Toast.LENGTH_SHORT).show();
           } else if (!agreement.isChecked()) {
               Toast.makeText(this, "Agree our terms First", Toast.LENGTH_SHORT).show();
           } else {
               Toast.makeText(this, "Form Submited", Toast.LENGTH_SHORT).show();
           }
       }

       else
       {
            if(s.length()<0)
            {
                Toast.makeText(this, "Enter the Password", Toast.LENGTH_SHORT).show();
            }
            else if(st.length()<0)
            {
                Toast.makeText(this, "Re-Enter the Password", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Password not match", Toast.LENGTH_SHORT).show();
            }
       }
    }

    Button btnSubmit;
    EditText name,email,password,rePassword;
    RadioButton male,female,other;
    RadioGroup gender;
    CheckBox agreement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit=findViewById(R.id.SubmitBtn);
        name=findViewById(R.id.nameInput);
        email=findViewById(R.id.emailInput);
        password=findViewById(R.id.password);
        rePassword=findViewById(R.id.passwordRecheck);
        gender=findViewById(R.id.gender);
        agreement=findViewById(R.id.termsAndConditionsLicence);
        btnSubmit.setOnClickListener(this);
        male=findViewById(R.id.male);
        male.setChecked(true);
    }
}
package com.shsnk.numbercon;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.ValueIterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView out;
    EditText input;
    int len=0,rev=0;
    String value,store="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn=findViewById(R.id.button);
    out=findViewById(R.id.output);
    input=findViewById(R.id.editTextPhone);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            store="";
            len=input.getText().toString().length();
            if(len<=0)
            {
                Toast.makeText(MainActivity.this, "Enter the Number first", Toast.LENGTH_SHORT).show();
                out.setText("NOTHING TO SHOW");
            }
            else if(len>9)
            {
                Toast.makeText(MainActivity.this, "Enter the Valid Number", Toast.LENGTH_SHORT).show();
                out.setText("ATMOST 9 DIGIT NUMBER ONLY");
            }
            else
            {
                value=input.getText().toString();
                int valueInt=Integer.parseInt(value);
                int rev=0;
                while(valueInt>0)
                {
                    rev=rev*10+valueInt%10;
                    valueInt=valueInt/10;
                }
                if(len>=8)
                {
                    if(len%2==0)
                    {
                        if(rev%10!=0)
                        store=store+unitPlace(rev%10)+"CRORE";
                        rev=rev/10;
                        len--;
                    }
                    else
                    {
                        int temp=(rev%10)*10+(rev%100)/10;
                        if(temp<=19)
                        {
                            if(rev%10!=0)
                            store=store+specialTen(temp)+"CRORE";
                        }
                        else
                        {
                            store=store+tenPlace(temp/10)+unitPlace(temp%10)+"CRORE";
                        }
                        len=len-2;
                        rev=rev/100;
                    }
                }
                if(len>=6)
                {
                    if(len%2==0)
                    {
                        if(rev%10!=0)
                        store=store+unitPlace(rev%10)+"LAKH";
                        rev=rev/10;
                        len--;
                    }
                    else
                    {
                        int temp=(rev%10)*10+(rev%100)/10;
                        if(temp<=19)
                        {
                            if(rev%10!=0)
                            store=store+specialTen(temp)+"LAKH";
                        }
                        else
                        {
                            store=store+tenPlace(temp/10)+unitPlace(temp%10)+"LAKH";
                        }
                        len-=2;
                        rev=rev/100;
                    }

                }
                if(len>=4)
                {
                    if(len%2==0)
                    {
                        if(rev%10!=0)
                            store=store+unitPlace(rev%10)+"THOUSAND";
                        rev=rev/10;
                        len--;
                    }
                    else
                    {
                        int temp=(rev%10)*10+(rev%100)/10;
                        if(temp<=19)
                        {
                            if(rev%10!=0)
                                store=store+specialTen(temp)+"THOUSAND";
                        }
                        else
                        {
                            store=store+tenPlace(temp/10)+unitPlace(temp%10)+"THOUSAND";
                        }
                        len-=2;
                        rev=rev/100;
                    }

                }
                if(len==3)
                {
                    if(rev%10!=0)
                    store=store+unitPlace(rev%10)+"HUNDRED";
                    rev=rev/10;
                    len--;
                }
                if(rev%10==1 && len>1)
                {
                    store=store+specialTen((rev%10)*10+rev/10);
                }
                else
                {
                    if(len==1)
                    {
                        store=store+unitPlace(rev);
                    }
                    else
                    {
                        store=store+tenPlace(rev%10)+unitPlace(rev/10);

                    }
                }
                out.setText(store);
            }

        }
    });
    }
    public String unitPlace(int num)
    {
        if(num==0)
        {
            return("");
        }
        else if(num==1)
        {
            return(" ONE ");
        }
        else if(num==2)
        {
            return(" TWO ");
        }
        else if(num==3)
        {
            return(" THREE ");
        }
        else if(num==4)
        {
            return(" FOUR ");
        }
        else if(num==5)
        {
            return(" FIVE ");
        }
        else if(num==6)
        {
            return(" SIX ");
        }
        else if(num==7)
        {
            return(" SEVEN ");
        }
        else if(num==8)
        {
            return(" EIGHT ");
        }
        else if(num==9)
        {
            return(" NINE ");
        }
        return("");
    }
    public String specialTen(int num)
    {
        if(num==10)
        {
            return(" TEN ");
        }
        else if(num==11)
        {
            return(" ELEVEN ");
        }
        else if(num==12)
        {
            return(" TWELVE ");
        }
        else if(num==13)
        {
            return(" THIRTEEN ");
        }
        else if(num==14)
        {
            return(" FOURTEEN ");
        }
        else if(num==15)
        {
            return(" FIFTEEN ");
        }
        else if(num==16)
        {
            return(" SIXTEEN ");
        }
        else if(num==17)
        {
            return(" SEVENTEEN ");
        }
        else if(num==18)
        {
            return(" EIGHTEEN ");
        }
        else if(num==19)
        {
            return(" NINTEEN ");
        }
        return("");
    }
    public String tenPlace(int num)
    {
        if(num==2)
        {
            return(" TWENTY ");
        }
        else if(num==3)
        {
            return(" THIRTY ");
        }
        else if(num==4)
        {
            return(" FOURTY ");
        }
        else if(num==5)
        {
            return(" FIFTY ");
        }
        else if(num==6)
        {
            return(" SIXTY ");
        }
        else if(num==7)
        {
            return(" SEVENTY ");
        }
        else if(num==8)
        {
            return(" EIGHTY ");
        }
        else if(num==9)
        {
            return(" NINTY ");
        }
        return("");
    }
}
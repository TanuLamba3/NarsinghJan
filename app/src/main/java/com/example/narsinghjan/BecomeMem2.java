package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.narsinghjan.Classes.Portfolio;
import com.example.narsinghjan.databinding.FragmentLanguageBinding;

public class BecomeMem2 extends AppCompatActivity {

    EditText AadharNum,
            Date,
            district,
            pinCode;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_mem2);
        hook();
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BecomeMem3.p.setAadharNum(AadharNum.getText().toString());
                BecomeMem3.p.setDate(Date.getText().toString());
                BecomeMem3.p.setDistrict(district.getText().toString());
                BecomeMem3.p.setPinCode(pinCode.getText().toString());
            }
        });
    }

    private void hook() {
        AadharNum=findViewById(R.id.AadharNum);
        Date=findViewById(R.id.Date);
        district=findViewById(R.id.district);
        pinCode=findViewById(R.id.pinCode);
        Next=findViewById(R.id.Next);
    }
}
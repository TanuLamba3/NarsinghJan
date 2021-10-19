package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            district,state,
            pinCode,permanentAdd;

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
                BecomeMem3.p.setDate(pinCode.getText().toString());
                BecomeMem3.p.setDistrict(district.getText().toString());
                BecomeMem3.p.setPinCode(state.getText().toString());
                BecomeMem3.p.setPinCode(permanentAdd.getText().toString());
                startActivity(new Intent(BecomeMem2.this,BecomeMem3.class));
            }
        });
    }

    private void hook() {
        AadharNum=findViewById(R.id.AadharNum);
        pinCode=findViewById(R.id.pinCode);
        district=findViewById(R.id.enter_district);
        state=findViewById(R.id.state);
        permanentAdd=findViewById(R.id.permanentAdd);
        Next=findViewById(R.id.Next);
    }
}
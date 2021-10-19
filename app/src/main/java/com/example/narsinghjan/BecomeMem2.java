package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.narsinghjan.Classes.Portfolio;

public class BecomeMem2 extends AppCompatActivity {

    EditText AadharNum,
            permanentAdd,
            pinCode,
            state,
            enter_district;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_mem2);
        hook();
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BecomeMem3.p.setAadhar_no(AadharNum.getText().toString());
                BecomeMem3.p.setPincode(Integer.parseInt(pinCode.getText().toString()));
                BecomeMem3.p.setPermanent_address(permanentAdd.getText().toString());
                BecomeMem3.p.setState(state.getText().toString());
                BecomeMem3.p.setDistrict(enter_district.getText().toString());
                startActivity(new Intent(BecomeMem2.this,BecomeMem3.class));
            }
        });
    }

    private void hook() {
        enter_district=findViewById(R.id.enter_district);
        state=findViewById(R.id.state);
        AadharNum=findViewById(R.id.AadharNum);
        pinCode=findViewById(R.id.pinCode);
        permanentAdd=findViewById(R.id.permanentAdd);
        Next=findViewById(R.id.Next);
    }
}
package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.narsinghjan.API_DATA.RetrofitClient;
import com.example.narsinghjan.Classes.Portfolio;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class BecomeMem3 extends AppCompatActivity {

    public static Portfolio p=new Portfolio();

    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_mem3);
        Submit=findViewById(R.id.Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Portfolio> call= RetrofitClient.getService().postPortfolio(p);
                call.enqueue(new Callback<Portfolio>() {
                    @Override
                    public void onResponse(Call<Portfolio> call, Response<Portfolio> response) {
                        Toast.makeText(BecomeMem3.this, "Response "+response.code(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Portfolio> call, Throwable t) {
                        Toast.makeText(BecomeMem3.this, "Failed ", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
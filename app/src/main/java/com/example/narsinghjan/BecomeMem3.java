//package com.example.narsinghjan;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.util.Base64;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.narsinghjan.API_DATA.RetrofitClient;
//import com.example.narsinghjan.Classes.Portfolio;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class BecomeMem3 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_become_mem3);
//    }
//}

package com.example.narsinghjan;

        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.util.Base64;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.narsinghjan.API_DATA.RetrofitClient;
        import com.example.narsinghjan.Classes.Portfolio;

        import java.io.IOException;
        import java.io.InputStream;

        import retrofit2.Call;
        import retrofit2.Callback;
        import retrofit2.Response;

public class BecomeMem3 extends AppCompatActivity {

    private int REQ_PDF = 21;
    private String enCodedPDF;

    ImageView image_upload;
    ImageView photo_upload;
    TextView txtUpload;
    TextView txtPhotoUpload;
    Button Submit;

    public static Portfolio p=new Portfolio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_mem3);
        //for upload image
        image_upload = findViewById(R.id.image_upload);
        txtUpload = findViewById(R.id.txtUpload);
        photo_upload = findViewById(R.id.photo_upload);
        txtPhotoUpload = findViewById(R.id.txtPhotoUpload);

        image_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
                chooseFile.setType("application/pdf");
                chooseFile = Intent.createChooser(chooseFile,"choose a file");
                startActivityForResult(chooseFile, REQ_PDF);
            }
        });
        photo_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
                chooseFile.setType("application/pdf");
                chooseFile = Intent.createChooser(chooseFile,"choose a file");
                startActivityForResult(chooseFile, REQ_PDF);
            }
        });
        txtPhotoUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                uploadDocument();
                Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
                chooseFile.setType("application/pdf");
                chooseFile = Intent.createChooser(chooseFile,"choose a file");
                startActivityForResult(chooseFile, REQ_PDF);
            }
        });

        txtUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                uploadDocument();
                Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
                chooseFile.setType("application/pdf");
                chooseFile = Intent.createChooser(chooseFile,"choose a file");
                startActivityForResult(chooseFile, REQ_PDF);
            }
        });

        hook();
        p.setPincode(123456);
        p.setPermanent_address("");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Portfolio> call = RetrofitClient.getService().postPortfolio(p);
                call.enqueue(new Callback<Portfolio>() {
                    @Override
                    public void onResponse(Call<Portfolio> call, Response<Portfolio> response) {
                        if (response.code()==201 || response.code()==200) {
                            Toast.makeText(BecomeMem3.this, "Saved ", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getApplicationContext(), ""+response.code(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Portfolio> call, Throwable t) {
                        Toast.makeText(BecomeMem3.this, "NOT Saved !!!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void hook() {
        Submit=findViewById(R.id.Submit);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_PDF && resultCode == RESULT_OK && data != null){
            Uri path = data.getData();

            try {
                InputStream inputStream = BecomeMem3.this.getContentResolver().openInputStream(path);
                byte[] PdfInBytes = new byte[inputStream.available()];
                inputStream.read(PdfInBytes);
                enCodedPDF = Base64.encodeToString(PdfInBytes,Base64.DEFAULT);
                Toast.makeText(this,"Document selected",Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webLink);
        webView.loadUrl("https://www.kooapp.com/profile/%4E%4A%50%34%49%4E%44%49%41");
        webView.setWebViewClient(new webViewController());
    }
}
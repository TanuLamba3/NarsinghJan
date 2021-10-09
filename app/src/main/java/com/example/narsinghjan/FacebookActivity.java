package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webViewFB);
        webView.loadUrl("https://www.facebook.com/NJP4INDIA/");
        webView.setWebViewClient(new webViewController());
    }
}
package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class InstagramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webInsta);
        webView.loadUrl("https://www.instagram.com/invites/contact/?i=1he2z86dlkn77&utm_content=ml5kafs");
        webView.setWebViewClient(new webViewController());
    }
}
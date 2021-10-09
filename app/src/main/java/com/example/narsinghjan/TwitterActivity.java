package com.example.narsinghjan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class TwitterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webTweet);
        webView.loadUrl("https://twitter.com/NJP4INDIA?s=09");
        webView.setWebViewClient(new webViewController());
    }
}
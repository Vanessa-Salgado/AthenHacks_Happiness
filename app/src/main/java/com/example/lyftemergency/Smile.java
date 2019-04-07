package com.example.lyftemergency;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.app.SearchManager;
import android.webkit.WebView;
import android.webkit.WebSettings;


public class Smile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView search = (WebView) findViewById(R.id.webView);

        WebSettings webSettings = search.getSettings();
        webSettings.setJavaScriptEnabled(true);

        search.loadUrl("https://www.google.com/search?q=cuddling+my+dog&oq=cuddling+my+dog&aqs=chrome..69i57j0l5.2421j0j7&sourceid=chrome&ie=UTF-8");

    }
}

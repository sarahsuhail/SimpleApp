package com.example.simpleapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

/**
 * Created by Sarah on 03-08-2018.
 */
public class Activity2 extends Activity {
    WebView webView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        webView = (WebView) findViewById(R.id.webView);

        Intent i = getIntent();
        url = i.getStringExtra("key");
        Log.e("url", "" + url);
        webView.loadUrl("https://www." + url + "/");

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
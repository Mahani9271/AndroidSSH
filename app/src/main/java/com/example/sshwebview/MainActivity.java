package com.example.sshwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mahanweb =  (WebView) findViewById(R.id.mahanview);
        setContentView(mahanweb);
        mahanweb.loadUrl("http://127.0.0.1/ssh2");
        WebSettings webSettings = mahanweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}

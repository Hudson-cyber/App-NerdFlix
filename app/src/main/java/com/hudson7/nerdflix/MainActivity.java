package com.hudson7.nerdflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    //WebView myWebView = (WebView) findViewById(R.id.webview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //usando a tela principal
        WebView myWebView = (WebView) findViewById(R.id.webview);
        //Ativando a visualização do javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //direcionando a urj
        myWebView.loadUrl("https://nerdflix-rouge.vercel.app/");


    }
}
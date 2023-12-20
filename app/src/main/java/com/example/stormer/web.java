package com.example.stormer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.nettr);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Bật JavaScript (nếu cần)
        webSettings.setDomStorageEnabled(true); // Bật lưu trữ DOM (nếu cần)

        // Load URL khi ứng dụng bắt đầu
        String urlToLoad = "https://stormer1407.github.io/ProjectOne_VNJP/"; // Thay thế bằng URL của bạn
        webView.loadUrl(urlToLoad);
    }

}
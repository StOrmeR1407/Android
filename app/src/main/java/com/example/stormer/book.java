package com.example.stormer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class book extends AppCompatActivity {

    private WebView webViewbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        webViewbook = findViewById(R.id.bookweb);
        WebSettings webSettings = webViewbook.getSettings();
        webSettings.setJavaScriptEnabled(true); // Bật JavaScript (nếu cần)
        webSettings.setDomStorageEnabled(true); // Bật lưu trữ DOM (nếu cần)

        // Load tệp HTML từ thư mục assets
        String htmlFilename = "index.html"; // Thay thế bằng tên tệp HTML bạn muốn hiển thị
        String baseUrl = "file:///android_asset/"; // Đường dẫn cơ sở cho tệp HTML trong assets
        String htmlFilePath = baseUrl + htmlFilename;
        webViewbook.loadUrl(htmlFilePath);
    }
}
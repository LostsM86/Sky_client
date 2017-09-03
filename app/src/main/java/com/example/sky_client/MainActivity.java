package com.example.sky_client;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://10.206.12.194:8080");

        FloatingActionButton settingButton = (FloatingActionButton)findViewById(R.id.settingButton);
        settingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // 打开设置菜单
            }
        });

        FloatingActionButton screenshotButton = (FloatingActionButton)findViewById(R.id.screenshotButton);
        screenshotButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 截图
            }
        });
    }
}
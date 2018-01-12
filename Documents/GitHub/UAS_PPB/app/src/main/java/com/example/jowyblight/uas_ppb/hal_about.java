package com.example.jowyblight.uas_ppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class hal_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_about);

        WebView browser = (WebView) findViewById(R.id.tentang);
        browser.loadData("" +
                "<html>" +
                " <body>" +
                " <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi ini aplikasi<br/>" +
                "Login dan Register<br/>" +
                "</p>" +
                "<p>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "</p>" +
                "<p>" +
                "1106075 - Mikhail Yazid Bustomi<br/>" +
                "1406117 - Sofyan Satia Ritonga<br/>" +
                "1406003 - Abdul Majid<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}

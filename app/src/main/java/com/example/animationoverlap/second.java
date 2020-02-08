package com.example.animationoverlap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class second extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        webView = (WebView) findViewById(R.id.wv);
        webView.setWebViewClient(new clintss() );
       webView.getSettings().setJavaScriptEnabled(true);
       webView.loadUrl("https://www.facebook.com/");



        Fade slideanimation = new Fade();
        slideanimation.setDuration(500);



        getWindow().setEnterTransition(slideanimation);
        getWindow().setExitTransition(slideanimation);
        getWindow().setAllowEnterTransitionOverlap(false);
    }

    public class clintss extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }


}

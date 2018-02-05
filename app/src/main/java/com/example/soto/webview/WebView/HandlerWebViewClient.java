package com.example.soto.webview.WebView;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Soto on 31/1/2018.
 */

public class HandlerWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Context contex = null;
        view.loadUrl(url);
        Toast.makeText(contex, url + " Hola", Toast.LENGTH_LONG).show();;
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url){

    }

    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
    }
}

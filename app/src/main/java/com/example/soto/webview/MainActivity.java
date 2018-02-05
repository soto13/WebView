package com.example.soto.webview;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.example.soto.webview.WebView.HandlerWebChromeClient;
import com.example.soto.webview.WebView.HandlerWebViewClient;
import com.example.soto.webview.classes.WebAppInterface;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    // cuando presione atras, este se regresa
    @Override
    public void onBackPressed() {
        if(wv.canGoBack()) {
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView) findViewById(R.id.wv);
        // Habilitamos JavaScript
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        wv.addJavascriptInterface(new WebAppInterface(this), "alertJava");
        // Priorizamos la renderizacion
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.getSettings().setAllowFileAccess(true);
        // Cargar la URL
        // wv.loadUrl("https://www.transportesjacoruta655.com/ventaonline/");
        wv.loadUrl("https://still-savannah-27884.herokuapp.com/");
        // wv.setWebViewClient(new WebViewClient());
        // Pruebas
        // wv.setWebViewClient(new HandlerWebViewClient());
        wv.setWebViewClient(new WebViewClient());
        // wv.setWebChromeClient(new HandlerWebChromeClient());
        wv.setWebChromeClient(new WebChromeClient());
    }
}

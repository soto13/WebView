package com.example.soto.webview.WebView;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by Soto on 31/1/2018.
 */

public class HandlerWebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        return true;
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        return true;
    }

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultMessage, final JsPromptResult result) {
        return true;
    }
}

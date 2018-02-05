package com.example.soto.webview.HttpHandler;

/**
 * Created by Soto on 29/1/2018.
 */

public class HttpHandler {
    public String post(String urlPost) {
        try {
            return "hola";
        } catch (Exception e) { return "Ops!! Ha ocurrido un error" + e.getMessage(); }
    }
}

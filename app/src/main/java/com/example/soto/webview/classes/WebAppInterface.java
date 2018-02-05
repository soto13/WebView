package com.example.soto.webview.classes;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.example.soto.webview.R;

import static java.lang.Integer.*;

/**
 * Created by Soto on 29/1/2018.
 */

public class WebAppInterface {
    private Context context;
    Integer status;

    // Instancia la interfaz y inicializa el contexto
    public WebAppInterface(Context context) {
        this.context = context;
    }

    // Muestra un toast para la pagina web
    @JavascriptInterface
    public void showText(String status, String message, String card, String number, String year, String password) {
        this.status = Integer.parseInt(status);
        if(this.status == 200) {
            AlertDialog alert = new AlertDialog.Builder(context).create();
            alert.setTitle("The status was: " + status);
            alert.setMessage(message + " - " + card + " - " + number + " - " + year + " - " + password);
            alert.setIcon(R.drawable.ic_launcher_background);

            alert.show();
            Toast.makeText(context.getApplicationContext(), message + " - " + card + " - " + number + " - " + year + " - " + password, Toast.LENGTH_SHORT).show();
        } else if(this.status == 400) {
            AlertDialog alert = new AlertDialog.Builder(context).create();
            alert.setTitle("The status was: " + status);
            alert.setMessage(message);
            alert.setIcon(R.drawable.ic_launcher_background);

            alert.show();
            Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }

    }
}

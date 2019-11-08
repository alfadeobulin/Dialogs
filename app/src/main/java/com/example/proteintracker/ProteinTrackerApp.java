package com.example.proteintracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProteinTrackerApp extends AppCompatActivity {
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_tracker_app);
        Button resetButton = (Button) findViewById(R.id.btnReset);
        resetButton.setOnClickListener(resetButtonListener);
        progressDialog = new ProgressDialog(ProteinTrackerApp.this);
        progressDialog.setMessage("Melakukan sesuatu ...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    }

    private View.OnClickListener resetButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final Dialog dialog = new Dialog(ProteinTrackerApp.this);
            dialog.setContentView(R.layout.custom_dialog);
            dialog.setTitle("Custom Dialog");

            Button btnCustom = (Button) dialog.findViewById(R.id.btnTombol);
            btnCustom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }
    };
}

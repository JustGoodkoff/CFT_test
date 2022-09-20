package com.example.cft_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Button greetingButton = findViewById(R.id.greetingButton);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Здравствуйте, " + name);

        builder.setPositiveButton("Ok", (dialogInterface, i) ->
                greetingButton.setVisibility(View.VISIBLE));

        builder.setOnDismissListener(dialogInterface -> {
            greetingButton.setVisibility(View.VISIBLE);
        });

        greetingButton.setOnClickListener(view -> {
            greetingButton.setVisibility(View.INVISIBLE);
            AlertDialog dialog = builder.create();
            dialog.show();
        });

    }
}
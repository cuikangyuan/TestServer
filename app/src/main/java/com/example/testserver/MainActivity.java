package com.example.testserver;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button start;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start_service);
        stop = findViewById(R.id.stop_service);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });

    }


    private void start() {
        Intent intent = new Intent();
        intent.setClass(this, RemoteService.class);
        startService(intent);
    }

    private void stop() {
        Intent intent = new Intent();
        intent.setClass(this, RemoteService.class);
        stopService(intent);
    }
}
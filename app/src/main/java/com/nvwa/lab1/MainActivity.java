package com.nvwa.lab1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {
        TextView textView = findViewById(R.id.newButton);
        Random rnd = new Random();
        textView.setTextColor(Color.rgb(
                rnd.nextInt() % 256,
                rnd.nextInt() % 256,
                rnd.nextInt() % 256));

    }
}

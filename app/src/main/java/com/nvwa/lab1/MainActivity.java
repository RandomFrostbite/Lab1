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
        TextView textView = findViewById(R.id.pushme);
        Random rnd = new Random();
        textView.setBackgroundColor( Color.rgb(
                rnd.nextInt() % 256,
                rnd.nextInt() % 256,
                rnd.nextInt() % 256));
        textView.setTextSize( ( rnd.nextInt() % 10 ) + 10 );

    }

    public void submit(View view) {
        TextView code = findViewById(R.id.code);
        TextView food = findViewById(R.id.food);

        Random rnd = new Random();
        int codeNum = -1;
        try {
            codeNum = Integer.parseInt(code.getText().toString());
        } catch( Exception e ) {}

        if ( codeNum == 42  && food.getText().toString().toLowerCase().equals( "not a cake" ) ) {
            code.setHint( getString(R.string.code11) );
            food.setHint( getString(R.string.food11) );
        } else if ( codeNum == 42 || food.getText().toString().toLowerCase().equals( "not a cake" ) ) {
            code.setHint( getString(R.string.code10) );
            food.setHint( getString(R.string.food10) );
        } else if ( code.getText().length() == 0 || food.getText().length() == 0 ) {
            code.setHint( getString(R.string.code01) );
            food.setHint( getString(R.string.food01) );
        } else {
            code.setHint( getString(R.string.code00) );
            food.setHint( getString(R.string.food00) );
        }

        code.setBackgroundColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));
        code.setTextColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));
        code.setHintTextColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));

        food.setBackgroundColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));
        food.setTextColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));
        food.setHintTextColor( Color.rgb( rnd.nextInt() % 256, rnd.nextInt() % 256, rnd.nextInt() % 256));
        
        code.setText("");
        food.setText("");

    }
}

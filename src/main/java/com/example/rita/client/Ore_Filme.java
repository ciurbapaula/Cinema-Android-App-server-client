package com.example.rita.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ore_Filme extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ore__filme);

        TextView tv = findViewById(R.id.textView9);
        String arg = getIntent().getExtras().getString("arg");
        tv.setText(arg);




        Button ora1 = (Button) findViewById(R.id.button8);
        ora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Ore_Filme.this, scaune.class);
                startActivity(intent);

            }
        });
        String arg2 = getIntent().getExtras().getString("arg2");
        ora1.setText(arg2);




        Button ora2 = (Button) findViewById(R.id.button9);
        ora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ore_Filme.this, scaune.class);
                startActivity(intent);
            }
        });
        String arg3 = getIntent().getExtras().getString("arg3");
        ora2.setText(arg3);




        Button ora3 = (Button) findViewById(R.id.button7);
        ora3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ore_Filme.this, scaune.class);
                startActivity(intent);
            }
        });
        String arg4 = getIntent().getExtras().getString("arg4");
        ora3.setText(arg4);

    }
}

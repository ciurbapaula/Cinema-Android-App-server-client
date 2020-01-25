package com.example.rita.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Filme_button extends AppCompatActivity {

    public String str1,str2,str3,str4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme_button);



        final Button  film1= (Button) findViewById(R.id.button);
        film1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = "Descrierea pt tomb raider";
                str2 = "15:00";
                str3 = "17:00";
                str4 = "22:00";
                Intent intent = new Intent(Filme_button.this, Ore_Filme.class);
                intent.putExtra("arg",str1);
                intent.putExtra("arg2", str2);
                intent.putExtra("arg3", str3);
                intent.putExtra("arg4", str4);
                startActivity(intent);



            }
        });

        final Button film2= (Button) findViewById(R.id.button2);
        film2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = "Descrierea pt avengers";
                str2 = "12:00";
                str3 = "13:00";
                str4 = "14:00";
                Intent intent = new Intent(Filme_button.this, Ore_Filme.class);
                intent.putExtra("arg",str1);
                intent.putExtra("arg2", str2);
                intent.putExtra("arg3", str3);
                intent.putExtra("arg4", str4);
                startActivity(intent);


            }
        });

        Button film3= (Button) findViewById(R.id.button3);
        film3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = "Descrierea pt jumanji";
                str2 = "14:00";
                str3 = "17:00";
                str4 = "20:00";
                Intent intent = new Intent(Filme_button.this, Ore_Filme.class);
                intent.putExtra("arg",str1);
                intent.putExtra("arg2", str2);
                intent.putExtra("arg3", str3);
                intent.putExtra("arg4", str4);
                startActivity(intent);

            }
        });

        Button film4= (Button) findViewById(R.id.button4);
        film4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = "Descrierea pt mamma mia 2";
                str2 = "11:00";
                str3 = "17:00";
                str4 = "19:00";
                Intent intent = new Intent(Filme_button.this, Ore_Filme.class);
                intent.putExtra("arg",str1);
                intent.putExtra("arg2", str2);
                intent.putExtra("arg3", str3);
                intent.putExtra("arg4", str4);
                startActivity(intent);

            }
        });

        Button film5= (Button) findViewById(R.id.button5);
        film5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = "Descriere pt showman";
                str2 = "12:00";
                str3 = "15:00";
                str4 = "20:00";
                Intent intent = new Intent(Filme_button.this, Ore_Filme.class);
                intent.putExtra("arg",str1);
                intent.putExtra("arg2", str2);
                intent.putExtra("arg3", str3);
                intent.putExtra("arg4", str4);
                startActivity(intent);

            }
        });













































    }

}

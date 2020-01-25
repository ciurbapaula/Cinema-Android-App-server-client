package com.example.rita.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends AppCompatActivity implements returnS {
    private Socket socket;
    private String s;
    private static final int SERVERPORT = 4444
            ;
    private static final String SERVER_IP = "192.168.0.106"; //, 176.139.173.92
    BufferedReader input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        new Thread(new ClientThread(s)).start();
      try {
          Thread.sleep(200);
      }
      catch(Exception ex)
      {
          Log.e("exceptoion",ex.toString());
      }
      this.socket = temp.socket;
        Button button2= (Button) findViewById(R.id.myButton2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input = new BufferedReader(new InputStreamReader(socket.getInputStream()));


                    //Log.d("input:", st);


                } catch (Exception ex) {
                    Log.d("eroare input","inptu error");
                }
                new Thread(new ClientThread2(input)).start();

            }
        });

        Button button= (Button) findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    EditText et = (EditText) findViewById(R.id.EditText01);

                    final String str = et.getText().toString();

                    final PrintWriter out = new PrintWriter(new BufferedWriter(

                            new OutputStreamWriter(socket.getOutputStream())),

                            true);

                    out.println(str); //trimitere catre server



                    //primire text




                } catch (UnknownHostException e) {

                    e.printStackTrace();

                } catch (IOException e) {

                    e.printStackTrace();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }
        });
        Button listaFilme= (Button) findViewById(R.id.button6);

        listaFilme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Client.this, Filme_button.class));

            }
        });
    }


    public void onClick(View view) {


    }


    @Override
    public Socket returnedSocket(Socket socket) {
        this.socket = socket;
        Log.d("connected", socket.toString());
        return null;
    }
}

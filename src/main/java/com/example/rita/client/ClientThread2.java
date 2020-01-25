package com.example.rita.client;

import android.util.Log;

import java.io.BufferedReader;

class   ClientThread2 implements Runnable {
    BufferedReader input;

    ClientThread2(BufferedReader input) {
        this.input = input;
        Log.d("sdas","asdsada");
    }

    @Override

    public void run() {
        Log.d("sdas","asdsada");
        try {
            String st = input.readLine();
            Log.d("it", st);
        } catch (Exception ex) {

        }

    }


}
